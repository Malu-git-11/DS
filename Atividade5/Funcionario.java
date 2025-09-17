/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade5;

/**
 *
 * @author Admin
 */
public class Funcionario {
    private String nome;
    private double salario;
    
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public double getSalario(){
        return salario;
    }
    public void setSalario(double Salario){
        this.salario = salario;
    }
    
    public void exibirInfo(){
        System.out.println("--- Funcionario ---");
        System.out.println("Nome: " +getNome());
        System.out.println("Salario: " +getSalario() + " reais");
    }
    
}
