package com.jonathan.micael.Ex1;

import java.time.LocalDate;
import java.util.Scanner;

public class FuncionarioTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Funcionario func = new Funcionario();

        System.out.println("Qual o id do funcionario? ");
        func.setIdFunc(Integer.parseInt(sc.nextLine()));

        System.out.println("Qual o nome do Funcionário? ");
        func.setNomeFunc(sc.nextLine());

        System.out.println("Qual o departamento? ");
        func.setDepartamento(sc.nextLine());

        System.out.println("Qual a data de contratação? (ano/mes/dia)");
        func.setDataContratacao(LocalDate.parse(sc.nextLine()));

        System.out.println("Qual o salário? ");
        func.setSalario(Double.parseDouble(sc.nextLine()));

        System.out.println("Qual o documento? ");
        func.setDocumento(sc.nextLine());

        func.setAtivo(true);
        func.imprimir();

        double aumento;
        System.out.println("Digite o aumento: ");
        aumento = sc.nextDouble();

        func.atualizarSalario(aumento);

        func.imprimir();
        func.demiteFuncionario();

        func.imprimir();

    }
}
