/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade4;

/**
 *
 * @author Admin
 */
public class Main_Usuario {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Melissa", "Aluno");
        Usuario u2 = new Usuario("Luiza", "Professor");
        Usuario u3 = new Usuario("Joao", "Visitante");
        
        u1.exibirInfo();
        System.out.println("");
        u2.exibirInfo();
        System.out.println("");
        u3.exibirInfo();
    }
}
