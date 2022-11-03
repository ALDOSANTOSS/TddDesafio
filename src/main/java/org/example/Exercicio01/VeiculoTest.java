package org.example.Exercicio01;

public class VeiculoTest {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("BMW","Z500","M0343","Azul",100,true,50,0,20.000);
        v1.ligar();
        v1.acelerar();
        v1.frear();
        v1.desligar();
        v1.abastecer(70);
        v1.pintar("Preto");
    }


}
