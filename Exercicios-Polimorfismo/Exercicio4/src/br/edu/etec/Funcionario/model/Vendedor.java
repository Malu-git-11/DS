package br.edu.etec.Funcionario.model;
public class Vendedor extends Funcionario{

    @Override
    public void calcularSalario() {
        double salary = 10;
        double ajuste = 0.2;
        
        System.out.println("Salario Vendedor: R$" + (salary + (salary*ajuste)));
    }
    }
