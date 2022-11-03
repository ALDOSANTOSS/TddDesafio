package org.example.Exercicio02;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Livro livro01 = new Livro("Pai Rico, Pai Pobre", 50, 45, "Robert T. Kiyosak", "Finanças pessoais", 200);
        Livro livro02 = new Livro("Game of thrones", 50, 30, "George R. R. Martin", "fantasia", 500);
        Livro l3 = new Livro("A Princesa e a Rainha", 20, 50, "", "fantasia", 500);

        VideoGame ps4 = new VideoGame("PS4", 1800, 100, "Sony", "Slim", false);
        VideoGame ps5 = new VideoGame("PS4", 1000, 7, "Sony", "Slim", true);
        VideoGame xbox = new VideoGame("XBOX", 1500, 500, "Microsoft", "One", false);

        List<Livro> livros = new ArrayList<>();
        livros.add(livro01);
        livros.add(livro02 );
        livros.add(l3);

        List<VideoGame> games = new ArrayList<>();
        games.add(ps4);
        games.add(ps5);
        games.add(xbox);

        Loja americanas = new Loja("amazon","34242343", livros, games);

        livro02 .calculaImposto();
        l3.calculaImposto();

        ps5.calculaImposto();
        ps4.calculaImposto();

        americanas.listaLivros();
        americanas.listaVideoGames();
        americanas.calculaPatrimonio();

    }
}