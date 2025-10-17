package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Pessoa p1 = new Pessoa("Carlos");
        p1.falar();

        Usuario u1 = new Usuario("Maria");
        u1.logar();

        Funcionario f1 = new Funcionario("João", "123");
        f1.trabalhar();

        Professor prof1 = new Professor("Ana", "456");
        prof1.ensinar();

        Aluno a1 = new Aluno("Lucas", "789");
        a1.estudar();

        Pessoa p2 = new Professor("Marcos", "999");
        p2.falar();
    }
}