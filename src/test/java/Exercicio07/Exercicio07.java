package Exercicio07;


import org.example.Exercicio07.Gerente;
import org.example.Exercicio07.Supervisor;
import org.example.Exercicio07.Vendedor;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercicio07 {

    @Test
    public void consultarGerente() {
        Gerente gerente = new Gerente("Joao", 38, 8000.00);
        gerente.bonificacao();
        assertEquals(18000.00, gerente.getSalario());
    }

    @Test
    public void consultarSupervisor() {
        Supervisor supervisor = new Supervisor("Pedro", 39, 4500.00);
        supervisor.bonificacao();
        assertEquals(9500.00, supervisor.getSalario());
    }

    @Test
    public void consultarVendedor() {
        Vendedor vendedor = new Vendedor("Lucas", 55, 2500.00);
        vendedor.bonificacao();
        assertEquals(5500.00, vendedor.getSalario());
    }


}
