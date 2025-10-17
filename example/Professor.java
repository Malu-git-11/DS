package org.example;

public class Professor extends Funcionario {
    public Professor(String nome, String matricula) {
        super(nome, matricula);
    }

    public void ensinar() {
        System.out.println(getNome() + " está ensinando.");
    }
}
