package br.edu.etec.Instrumento.view;

import br.edu.etec.Instrumento.model.Guitarra;
import br.edu.etec.Instrumento.model.InstrumentoMusical;
import br.edu.etec.Instrumento.model.Piano;

public class TesteInstrumento {

    public static void main(String[] args) {
        InstrumentoMusical g1 = new Guitarra();
        InstrumentoMusical p1 = new Piano();

        g1.tocar();
        p1.tocar();
    }
}
    
