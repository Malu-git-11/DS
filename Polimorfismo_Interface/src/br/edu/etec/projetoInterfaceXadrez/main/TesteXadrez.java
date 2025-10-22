package br.edu.etec.projetoInterfaceXadrez.main;

import br.edu.etec.projetoInterfaceXadrezI.model.Peca;
import br.edu.etec.projetoInterfaceXadrezI.model.Bispo;


public class TesteXadrez {

    public static void main(String[] args) {   
        Peca bispo = new Bispo();
        bispo.mover();
    }
}
