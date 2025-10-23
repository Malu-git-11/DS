/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade1;

/**
 *
 * @author Admin
 */
public class veiculo {
    String modelo;
    String placa;
    double capacidadeCarga;
    
    veiculo(String modelo, String placa, double capacidadeCarga){
        this.modelo = modelo;
        this.placa = placa;
        this.capacidadeCarga = capacidadeCarga;
    }
    
    public void exibirInfo(){
        System.out.println("--- Gestao de Veiculo ---");
        System.out.println("Modelo: " +modelo);
        System.out.println("Placa: " +placa);
        System.out.println("Capacidade de Carga: " +capacidadeCarga + "kg");
    }
}
