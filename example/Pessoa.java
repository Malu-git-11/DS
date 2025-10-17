package org.example;

public class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void falar() {
        System.out.println(nome + " está falando.");
    }
}
