package org.example.Exercicio07;

public class Principal {
    public static void main(String[] args) {

        Funcionarios gerente = new Gerente("Joao", 38, 8000.00);
        System.out.println(gerente.toString());
        gerente.bonificacao();
        System.out.println(gerente.toString());

        Funcionarios surpevisor = new Supervisor("Pedro", 16, 4500.00);
        System.out.println(surpevisor.toString());
        surpevisor.bonificacao();
        System.out.println(surpevisor.toString());

        Funcionarios vendedor = new Vendedor("Lucas", 55, 2500.00);
        System.out.println(vendedor.toString());
        vendedor.bonificacao();
        System.out.println(vendedor.toString());

    }
}
