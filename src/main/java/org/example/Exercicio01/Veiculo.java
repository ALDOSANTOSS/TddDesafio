package org.example.Exercicio01;

public class Veiculo {
    private String Marca;
    private String Modelo;
    private String Placa;
    private String Cor;
    private float Km;
    private boolean Ligado;
    private int LitrosCombustivel;
    private int Velocidade;
    private double Preco;

    public Veiculo() {
    }

    public Veiculo(String marca, String modelo, String placa, String cor, float km, boolean ligado, int listrosCombustivel, int velocidade, double preco) {
        Marca = marca;
        Modelo = modelo;
        Placa = placa;
        Cor = cor;
        Km = km;
        Ligado = ligado;
        LitrosCombustivel = listrosCombustivel;
        Velocidade = velocidade;
        Preco = preco;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String cor) {
        Cor = cor;
    }

    public float getKm() {
        return Km;
    }

    public void setKm(float km) {
        Km = km;
    }

    public boolean isLigado() {
        return Ligado;
    }

    public void setLigado(boolean ligado) {
        Ligado = ligado;
    }

    public int getListrosCombustivel() {
        return LitrosCombustivel;
    }

    public void setListrosCombustivel(int listrosCombustivel) {
        LitrosCombustivel = listrosCombustivel;
    }

    public int getVelocidade() {
        return Velocidade;
    }

    public void setVelocidade(int velocidade) {
        Velocidade = velocidade;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double preco) {
        Preco = preco;
    }

    public short acelerar(){
        this.Velocidade += 20;
        System.out.println("Aumentou a volcidade mais 20km: ");

        return 0;
    }

    public short abastecer(int combustivel){
        this.LitrosCombustivel = combustivel;
        if (combustivel < 60){
            System.out.println("Ainda nao completou");
        }else {
            System.out.println("Ja completou");
        }


        return 0;
    }

    public void pintar(String alterarCor){
        this.Cor=alterarCor;
        System.out.println("A cor foi alterada");
    }

    public void frear(){
        this.Velocidade -=20;
        this.Ligado = false;

        System.out.println("Esta reduzindo menos 20km");

    }

    public void ligar(){
        this.Ligado = true;
        System.out.println("O carro foi ligado: ");
    }

    public void desligar(){
        this.Ligado = false;
        if (this.Velocidade == 0){
            System.out.println("Pode deligar: ");
        } else {
            System.out.println("Nao pode desligar porque esta andando: ");
        }

    }


}