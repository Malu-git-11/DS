package org.example;

public class Funcionario extends Usuario {

        private String matricula;

        public Funcionario(String nome, String matricula) {
            super(nome);
            this.matricula = matricula;
        }

        public String getMatricula() {
            return matricula;
        }

        public void trabalhar() {
            System.out.println(getNome() + " está trabalhando. Matrícula: " + matricula);
        }
}
