package org.example.Exercicio03;

public class Main {
    public static void main(String[] args) {

        Mago mago = new Mago();

        mago.setForca(20);
        mago.setMana(40);
        mago.setLevel(14);
        mago.setVida(2);
        mago.setInteligencia(2);
        mago.lvlUp();

        mago.attack();
        mago.attack();
        mago.attack();

        mago.apresentaMagia("x" +
                "");

        Guerreiro guerreiro = new Guerreiro();

        guerreiro.setForca(5);
        guerreiro.setMana(2);
        guerreiro.setLevel(1);
        guerreiro.setVida(3);
        guerreiro.setInteligencia(50);
        guerreiro.lvlUp();

        guerreiro.attack();
        guerreiro.attack();
        guerreiro.attack();

        guerreiro.apresentaHabilidade("x");

    }
}