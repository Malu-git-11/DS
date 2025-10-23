package Atividade3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Loja {
    private String nome;
    private String endereco;
    private String cpf;
    
    public Loja(String nome, String endereco, String cpf){
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome (String nome){
        this.nome = nome;
    }
    
     public String getEndereco(){
        return endereco;
    }
    
    public void setEndereco (String endereco){
        this.endereco = endereco;
    }
    
     public String getCPF(){
        return cpf;
    }
    
    public void setCPF (String cpf){
        this.cpf = cpf;
    }
    
    public void exibirInfo(){
        System.out.println("--- Gestao de Cliente ---");
        System.out.println("Nome: " +getNome());
        System.out.println("Endereco: " +getEndereco());
        System.out.println("CPF: " +getCPF());
    }
}
