/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade2;

/**
 *
 * @author Admin
 */
public class Animal {
    String nome;
    double peso;
    double altura;
    double imc = 0;
    
    Animal(String nome, double peso, double altura){
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }
    
    public double calcularIMC(){
        return imc = (this.peso / (this.altura * this.altura));
    }
    
    public void exibirInfo(){
        System.out.println("--- Animal IMC ---");
        System.out.println("Nome: " +nome);
        System.out.println("Peso: " +peso);
        System.out.println("Altura: " +altura + "cm");
        System.out.println("Seu IMC: " +calcularIMC());
    }
}
