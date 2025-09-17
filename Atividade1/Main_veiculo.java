/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade1;

/**
 *
 * @author Admin
 */
public class Main_veiculo {
    public static void main(String [] args ){
        veiculo v1 = new veiculo("VUC", "473DIE7D", 3000);
        veiculo v2 = new veiculo("Audi 6a", "983DKJ7D", 500);
        veiculo v3 = new veiculo("XR200", "213ESE7L", 50);
        
        v1.exibirInfo();
        v2.exibirInfo();
        v3.exibirInfo();
    }
}
