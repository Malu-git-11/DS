package org.example;

public class Usuario extends Pessoa{
    public Usuario(String nome) {
        super(nome);
    }

    public void logar() {
        System.out.println(getNome() + " fez login no sistema.");
    }
}
