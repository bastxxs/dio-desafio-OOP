package br.com.dio.desafio.oop;

import java.time.LocalDate;

public class Main{
    public static void main(String[] args) {
        
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Java");
        curso1.setCargaHoraria(80);

        
        Curso curso2 = new Curso();

        curso1.setTitulo("Curso JS");
        curso1.setDescricao("JS");
        curso1.setCargaHoraria(95);

        mentoria mentoriaJava = new Mentoria();

        mentoriaJava.setTitulo("Abstraindo um bootcamp com Java e OOP");
        mentoriaJava.setDescricao("Mentoria Java");
        mentoriaJava.setData(LocalDate.now());


        mentoria mentoriaJavaScript = new Mentoria();

        mentoriaJava.setTitulo("Conceitos Basicos de JavaScript");
        mentoriaJava.setDescricao("Mentoria JavaScript");
        mentoriaJava.setData(LocalDate.now());


    }
}