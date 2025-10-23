package br.edu.etec.Funcionario.view;

import br.edu.etec.Funcionario.model.Funcionario;
import br.edu.etec.Funcionario.model.Gerente;
import br.edu.etec.Funcionario.model.Vendedor;

public class TestFuncionario {
    public static void main(String[] args) {
        Funcionario g1 = new Gerente();
        Funcionario v1 = new Vendedor();
        
        g1.calcularSalario();
        v1.calcularSalario();
    } 
}
