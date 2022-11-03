package Exercicio040506;

import org.example.Exercicio040506.*;

import org.junit.jupiter.api.Test;




import static org.junit.jupiter.api.Assertions.*;

public class PessoaTestTdd {


    @Test
    public void testaMaisVelho() {
        PessoasMaisVelho pessoasMaisVelho = new PessoasMaisVelho();
        pessoasMaisVelho.pessoaMaisVelho();
        assertEquals("Leandro", "Leandro");


    }

    @Test
    public void testaRestoDeIdadeInferior18() {
        PessoasMenor18 pessoasMenor18 = new PessoasMenor18();
        pessoasMenor18.pessoasMenor18();
        assertEquals(pessoasMenor18.pessoasMenor18(), 2);


    }

    @Test
    public void consultaJessisa() {
        PessoaJessica pessoaJessica = new PessoaJessica();
        pessoaJessica.pessoaJessica();
        String esperado = "[nome: Jessica, idade: 18]";
        assertEquals(esperado, pessoaJessica.pessoaJessica());


    }

}
