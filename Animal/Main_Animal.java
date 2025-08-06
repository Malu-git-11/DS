/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animal;

/**
 *
 * @author Admin
 */
public class Main_Animal {
    public static void main(String [] args){
     //Objeto 
        Animal animal = new Animal();
        animal.idAnimal = 1;
        animal.nome = "Cachorro";
        animal.idade = 18;
        animal.tipo = "Quadrupede";
        
        System.out.println("------Classe Pessoa ------ ");
        System.out.println("Numero de identificador: " + animal.idAnimal);
        System.out.println("Nome: " + animal.nome);
        System.out.println("Idade: " + animal.idade);
        System.out.println("Tipo: " + animal.tipo);
        animal.comer();   
    }
}
