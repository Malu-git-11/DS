package br.edu.etec.Forma.model;
public class Circulo extends Forma{
    @Override
    public void CalcularArea(){
        double pi = 3.14;
        double r = 2;
        
        System.out.println("Area Circulo: " + pi*(r*r));
    }
}
