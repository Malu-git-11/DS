/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade5;

/**
 *
 * @author Admin
 */
public class Main_Funcionario {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Melissa", 2000, 1000);
        Desenvolvedor d1 = new Desenvolvedor("Maria", 5000, "Java");
        
        g1.exibirInfo();
        d1.exibirInfo();
    }
}
