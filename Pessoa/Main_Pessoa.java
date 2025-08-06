package Pessoa;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author Admin
 */
public class Main_Pessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Objeto 
        Pessoa pessoa = new Pessoa();
        pessoa.idPessoa = 1;
        pessoa.nome = "Malu";
        pessoa.idade = 18;
        pessoa.profissao = "Front-end";
        
        System.out.println("------Classe Pessoa ------ ");
        System.out.println("Numero de identificador: " + pessoa.idPessoa);
        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.idade);
        System.out.println("Profissao: " + pessoa.profissao);
        pessoa.estudar();
        
        //Objeto 1
        Pessoa pessoa1 = new Pessoa();
        pessoa1.idPessoa = 2;
        pessoa1.nome = "Maria";
        pessoa1.idade = 20;
        pessoa1.profissao = "Back-end";
        
        System.out.println("------Classe Pessoa ------ ");
        System.out.println("Numero de identificador: " + pessoa1.idPessoa);
        System.out.println("Nome: " + pessoa1.nome);
        System.out.println("Idade: " + pessoa1.idade);
        System.out.println("Profissao: " + pessoa1.profissao);
        pessoa1.trabalhar();
        
        //Objeto 2
        Pessoa pessoa2 = new Pessoa();
        pessoa2.idPessoa = 3;
        pessoa2.nome = "Giovanna";
        pessoa2.idade = 16;
        pessoa2.profissao = "RH";
        
        System.out.println("------Classe Pessoa ------ ");
        System.out.println("Numero de identificador: " + pessoa2.idPessoa);
        System.out.println("Nome: " + pessoa2.nome);
        System.out.println("Idade: " + pessoa2.idade);
        System.out.println("Profissao: " + pessoa2.profissao);
        pessoa2.falar();
        
        
    }
    
}
