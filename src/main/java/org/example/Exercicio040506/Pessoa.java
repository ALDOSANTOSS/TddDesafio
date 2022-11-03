package org.example.Exercicio040506;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private int idade;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public static String size() {
        return null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public int compareTo(Pessoa pessoa){
        return (this.idade - pessoa.getIdade());
    }

    @Override
    public String toString() {
        return "nome: " + nome +
                ", idade: " + idade ;
    }
}


