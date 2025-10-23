package br.edu.etec.Funcionario.model;
public class Gerente extends Funcionario{

    @Override
    public void calcularSalario() {
        double salary = 10;
        double porcent = 0.1;
        
        System.out.println("Salario Gerente: R$" + (salary + (salary*porcent)));
    }
    
}
