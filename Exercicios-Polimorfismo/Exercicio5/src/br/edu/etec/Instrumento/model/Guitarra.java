package br.edu.etec.Instrumento.model;

public class Guitarra implements InstrumentoMusical {

    @Override
    public void tocar() {
        System.out.println("A guitarra esta tocando um solo de rock!");
    }
}