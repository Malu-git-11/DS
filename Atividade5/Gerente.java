/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade5;

/**
 *
 * @author Admin
 */
public class Gerente extends Funcionario{
    private double bonusAnual;
    
    public Gerente (String nome, double salario, double bonusAnual){
        super(nome, salario);
        this.bonusAnual = bonusAnual;
    }
    
    public double getBonusAnual(){
        return bonusAnual;
    }
    
    public void serBonusAnual(double bonusAnual){
        this.bonusAnual = bonusAnual;
    }
    
    @Override
    public void exibirInfo(){
        System.out.println("--- Funcionario ---");
        System.out.println("Nome: " +getNome());
        System.out.println("Salario: " +getSalario() + " reais");
        System.out.println("Bonus Anual: " +getBonusAnual());
    }
}
