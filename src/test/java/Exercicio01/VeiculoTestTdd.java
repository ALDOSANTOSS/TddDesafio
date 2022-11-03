package Exercicio01;

import org.example.Exercicio01.Veiculo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VeiculoTestTdd {
    private Veiculo veiculo;

    @BeforeEach
    public void setup() {
        veiculo = new Veiculo("BMW", "Z500", "M0343", "Azul", 100, true, 50, 0, 20.000);
    }

    @Test
    public void ligarCarro() {
        Assertions.assertTrue(veiculo.isLigado());
    }

    @Test
    public void deverConsultarVelocidade() {
        assertEquals(veiculo.getKm(), 100);
    }

    

   
    @Test
    public void consultarFreio() {
        veiculo.frear();
        assertEquals(20, 20);


    }

    @Test
    public void consultarTanque()  {
        assertEquals(veiculo.abastecer(60), 30, 40);
    }


    @Test
    public void alterarCor(){
        assertEquals("Azul",veiculo.getCor());

    }


}
