package org.example;

public class Aluno extends Usuario{
    private String ra;

    public Aluno(String nome, String ra) {
        super(nome);
        this.ra = ra;
    }

    public String getRa() {
        return ra;
    }

    public void estudar() {
        System.out.println(getNome() + " está estudando. RA: " + ra);
    }

}
