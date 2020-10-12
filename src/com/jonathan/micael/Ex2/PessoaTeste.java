package com.jonathan.micael.Ex2;

public class PessoaTeste {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Jonathan Micael");
        pessoa.setIdade(19);

        pessoa.fazAniversario();
        pessoa.fazAniversario();
        pessoa.fazAniversario();
        pessoa.fazAniversario();
        pessoa.fazAniversario();
        pessoa.fazAniversario();
        pessoa.fazAniversario();
        pessoa.fazAniversario();

        pessoa.imprimir();
    }
}
