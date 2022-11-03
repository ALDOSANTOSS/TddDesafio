package Exercicio02;

import org.example.Exercicio02.Livro;

import org.example.Exercicio02.VideoGame;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercicio02 {


    @Test
    public void testaImpostoLivros() {
        Livro pai = new Livro("Pai Rico, Pai Pobre", 50, 45, "Robert T. Kiyosak", "educativo", 200);
        Livro game = new Livro("Game of thrones", 50, 30, "George R. R. Martin", "fantasia", 500);
        assertEquals(0, pai.calculaImposto());
        assertEquals(5, game.calculaImposto());
    }


    @Test
    public void testImpostoVide0Game(){
        VideoGame ps1 = new VideoGame("PS4", 1000, 100, "Sony", "Slim", false);
        VideoGame ps5 = new VideoGame("PS4", 1000, 7, "Sony", "Slim", true);
        assertEquals(450,ps1.calcularImpostoVideoGame());
        assertEquals(250,ps5.calcularImpostoVideoGame());
    }

}
