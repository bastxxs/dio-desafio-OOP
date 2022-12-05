package br.com.dio.desafio.oop;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    
    private String nome;
    private Set <Conteudos> conteudosInscritos = new LinkedHashSet<>();
    private Set <Conteudos> conteudosConcluidos = new LinkedHashSet<>();
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public Set<Conteudos> getConteudosInscritos() {
        return conteudosInscritos;
    }


    public void setConteudosInscritos(Set<Conteudos> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }


    public Set<Conteudos> getConteudosConcluidos() {
        return conteudosConcluidos;
    }


    public void setConteudosConcluidos(Set<Conteudos> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }


    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    };

    public void progredir(){
        Optional <Conteudos> conteudo = this.conteudosInscritos.stream().findFirst();

        if(conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        }else{

            System.out.println("Você ainda não se matriculou em um conteudo");
        }

    };

    public double calcularTotalXp(){

        return this.getConteudosConcluidos().stream().mapToDouble(conteudo -> conteudo.calcularXp()).sum();
    };

    @Override
    public boolean equals(Object o) {

        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) 
        && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    };

    public int hashCode() {

        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    };
  

}
