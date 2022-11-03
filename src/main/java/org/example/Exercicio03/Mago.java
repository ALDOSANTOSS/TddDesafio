package org.example.Exercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mago extends Personagem{
    private List<String> magia;
    private final Random numeroRandomico = new Random();

    public Mago() {
        magia = new ArrayList<>();
    }

    public List<String> getMagia() {
        return magia;
    }

    public void setMagia(List<String> magia) {
        this.magia = magia;
    }

    @Override
    public short lvlUp() {
        setMana(getMana() + 1);
        setInteligencia(getInteligencia() + 1);
        return 0;
    }

    public short attack(){
        setInteligencia(getInteligencia() * (getLevel()) + numeroRandomico.nextInt(300));
        magia.add("Força: " + getForca() + " Inteligência: " + getInteligencia() + " Level: " + getLevel() + " Mana: " + getMana());
        return 0;
    }

    public short apresentaMagia(String mag) {
        System.out.println("Magias:");
        for (String x : magia) {
            System.out.println(x);
        }
        return 0;
    }
}