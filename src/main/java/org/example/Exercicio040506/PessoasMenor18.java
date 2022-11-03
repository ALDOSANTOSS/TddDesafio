package org.example.Exercicio040506;

import java.util.ArrayList;
import java.util.List;

public class PessoasMenor18 {

    public short pessoasMenor18(){
        String nome = null;
        List<Pessoa> pessoas  = new ArrayList<>();
        pessoas.add(new Pessoa("Joao",15));
        pessoas.add(new Pessoa("Leandro",21));
        pessoas.add(new Pessoa("Paulo",17));
        pessoas.add(new Pessoa("Jessica",18));

        List<Pessoa> Pessoa = pessoas.stream()
                .filter(i -> i.getIdade() >= 18).toList();
        System.out.println("O resto de pessoas: " + Pessoa.size());

        return Short.parseShort(nome= String.valueOf(Pessoa.size()));
    }
}
