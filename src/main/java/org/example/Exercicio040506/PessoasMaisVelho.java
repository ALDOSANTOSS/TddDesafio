package org.example.Exercicio040506;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PessoasMaisVelho {


    public String pessoaMaisVelho(){
        String nome = null;

        List<Pessoa> pessoas  = new ArrayList<>();
        pessoas.add(new Pessoa("Joao",15));
        pessoas.add(new Pessoa("Leandro",21));
        pessoas.add(new Pessoa("Paulo",17));
        pessoas.add(new Pessoa("Jessica",18));

        Pessoa maisVelho  = pessoas.stream()
                .max(Comparator.comparing(Pessoa::getIdade)).get();
        System.out.println("Pessoa mais velha: " + maisVelho);


        return nome=maisVelho.getNome();
    }


}
