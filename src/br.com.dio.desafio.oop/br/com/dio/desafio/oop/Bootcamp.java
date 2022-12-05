package br.com.dio.desafio.oop;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

    private String nome;
    private String descricao;
    private final LocalDate dataInicio = LocalDate.now();
    private final LocalDate dataFim = dataInicio.plusDays(50);
    private Set <Dev> devsInscritos = new LinkedHashSet<>();
    private Set <Conteudos> conteudos = new LinkedHashSet<>();
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public LocalDate getDataInicio() {
        return dataInicio;
    }
    public LocalDate getDataFim() {
        return dataFim;
    }
    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }
    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }
    public Set<Conteudos> getConteudos() {
        return conteudos;
    }
    public void setConteudos(Set<Conteudos> conteudos) {
        this.conteudos = conteudos;
    }
    
    @Override
    
    public boolean equals(Object o) {

        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Bootcamp boot = (Bootcamp) o;
        return Objects.equals (nome, boot.nome) && Objects.equals(descricao, boot.descricao) 
        && Objects.equals(conteudos, boot.conteudos) && Objects.equals(dataInicio, boot.dataInicio) 
        && Objects.equals(dataFim, boot.dataFim) && Objects.equals(devsInscritos, boot.devsInscritos);
    };

    public int hashCode() {

        return Objects.hash(nome, descricao, dataInicio, dataFim, conteudos, devsInscritos);
    };

}
