/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade5;

/**
 *
 * @author Admin
 */
public class Desenvolvedor extends Funcionario{
    private String linguagem;
    
    public Desenvolvedor(String nome, double salario, String linguagem){
        super(nome, salario);
        this.linguagem = linguagem;
    }
    
    public String getLinguagem(){
        return linguagem;
    }
    
    public void setLinguagem(String linguagem){
        this.linguagem = linguagem;
    }
    
    @Override
    public void exibirInfo(){
        System.out.println("--- Funcionario ---");
        System.out.println("Nome: " +getNome());
        System.out.println("Salario: " +getSalario() + " reais");
        System.out.println("Linguagem: " + getLinguagem());
    }
}
