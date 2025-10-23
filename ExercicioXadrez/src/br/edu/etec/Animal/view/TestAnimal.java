package br.edu.etec.Animal.view;
import br.edu.etec.Animal.model.Cachorro;
import br.edu.etec.Animal.model.Gato;
import br.edu.etec.Animal.model.Animal;
public class TestAnimal {
    
    public static void main(String[] args) {
        Animal c1 = new Cachorro();
        Animal g1 = new Gato();
        
        g1.FazerSom();
        c1.FazerSom();
        
    }
}
