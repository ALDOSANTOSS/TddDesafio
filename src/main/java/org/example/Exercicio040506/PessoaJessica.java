package org.example.Exercicio040506;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PessoaJessica {


    public String pessoaJessica() {

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Joao", 15));
        pessoas.add(new Pessoa("Leandro", 21));
        pessoas.add(new Pessoa("Paulo", 17));
        pessoas.add(new Pessoa("Jessica", 18));

        List<Pessoa> pessoas1 = pessoas.stream()
                .filter(i -> i.getNome().equalsIgnoreCase("Jessica"))
                .collect(Collectors.toList());
        System.out.println(pessoas1);


        return pessoas1.toString();
    }
}
