package br.edu.etec.Veiculo.view;
import br.edu.etec.Veiculo.model.Bicicleta;
import br.edu.etec.Veiculo.model.Carro;
import br.edu.etec.Veiculo.model.Veiculo;
public class TestVeiculo {
    public static void main(String[] args) {
        
        Veiculo b1 = new Bicicleta();
        Veiculo c1 = new Carro();
        
        
        b1.mover();
        c1.mover();
    }
}
