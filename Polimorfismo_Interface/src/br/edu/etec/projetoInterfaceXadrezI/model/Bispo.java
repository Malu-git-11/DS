package br.edu.etec.projetoInterfaceXadrezI.model;

public class Bispo implements Peca {
    @Override
    public void mover(){
        System.out.println("Andar em diagonal");
    }
}
