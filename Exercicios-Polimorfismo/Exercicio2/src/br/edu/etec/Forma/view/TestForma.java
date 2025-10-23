package br.edu.etec.Forma.view;

import br.edu.etec.Forma.model.Circulo;
import br.edu.etec.Forma.model.Forma;
import br.edu.etec.Forma.model.Retangulo;;
public class TestForma {
    public static void main(String[] args) {
        Forma c1 = new Circulo();
        Forma r1 = new Retangulo();
        
        r1.CalcularArea();
        c1.CalcularArea();
    }
}
