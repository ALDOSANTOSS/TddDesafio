package org.example.Exercicio02;

import java.util.List;

public class Loja {
    private String nome;
    private String cnpj;
    private List<Livro> livros;
    private List<VideoGame> videoGames;

    public Loja() {
    }

    public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.livros = livros;
        this.videoGames = videoGames;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<VideoGame> getVideoGames() {
        return videoGames;
    }

    public void setVideoGames(List<VideoGame> videoGames) {
        this.videoGames = videoGames;
    }

    public void listaLivros() {
        if(livros.size() == 0) {
            System.out.println("A loja não sem livros no seu estoque");
        } else {
            System.out.println("-----------------------------------------------------");
            System.out.println("A loja amazon possui estes livros para venda: ");
            for(int i = 0; i < livros.size(); i++) {
                System.out.println("Titulo: " + livros.get(i).getNome() + " , preco: "
                        + livros.get(i).getPreco() + " , quantidade: "
                        + livros.get(i).getQtd() + " em estoque.");
            }
        }
    }

    public void listaVideoGames() {
        if(videoGames.size() == 0) {
            System.out.println("A loja não tem video-games no seu estoque");
        } else {
            System.out.println("-----------------------------------------------------");
            System.out.println("A loja amazon possui estes video-games para venda: ");
            for(int i = 0; i < videoGames.size(); i++) {
                System.out.println("Video-game: " + videoGames.get(i).getModelo() + " , preco: "
                        + videoGames.get(i).getPreco() + " , quantidade: "
                        + videoGames.get(i).getQtd() + " em estoque.");
            }
        }
    }

    public Double calculaPatrimonio () {

        double total = 0;
        for(Livro l: livros) {
            total += l.getPreco() * l.getQtd();
        }
        for(VideoGame v: videoGames) {
            total += v.getPreco() * v.getQtd();
        }
        System.out.println("-----------------------------------------------------");
        System.out.println("O patrimonio da loja: " + nome + " é de R$ " + String.format("%.2f", total));
        return total;
    }
}