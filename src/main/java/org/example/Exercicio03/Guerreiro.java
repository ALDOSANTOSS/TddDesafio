package org.example.Exercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem{
    private List<String> habilidade;
    private final Random numeroRandomico = new Random();

    public Guerreiro() {
        habilidade = new ArrayList<>();
    }

    public List<String> getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(List<String> habilidade) {
        this.habilidade = habilidade;
    }

    @Override
    public short lvlUp(){
        setVida(getVida() + 1);
        setForca(getForca() + 1);
        return 0;
    }

    public void attack(){
        setForca(getForca() * (getLevel() ) + numeroRandomico.nextInt(300));
        habilidade.add("Força: " + getForca() + " Inteligência: " + getInteligencia() + " Level: " + getLevel() + " Mana: " + getMana());
    }

    public void apresentaHabilidade(String hab) {
        System.out.println("Habilidades:");
        for (String x : habilidade) {
            System.out.println(x);
        }
    }
}