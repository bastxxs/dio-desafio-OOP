package br.com.dio.desafio.oop;

import java.time.LocalDate;

public class Mentoria {

    private String titulo;
    private String descricao;
    private LocalDate data;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public localDate getData() {
        return data;
    }

    public void setData(localDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "mentoria [titulo=" + titulo + ", descricao=" + descricao + ", data=" + data + "]";
    }

}
