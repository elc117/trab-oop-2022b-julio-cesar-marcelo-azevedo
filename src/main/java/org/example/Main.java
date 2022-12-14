package org.example;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Nutricionista nut = new Nutricionista("Ana");

        Escola e = new Escola("Coronel Pilar");

        Pessoa a1 = new Pessoa("Joao", 'm', 12, 61f, 1.54f, true);

        Pessoa a2 = new Pessoa("Pedro", 'm', 14, 60f, 1.63f, false);

        Pessoa a3 = new Pessoa("Ana", 'f', 16, 63f, 1.50f, true);

        Pessoa a4 = new Pessoa("Vitoria", 'f', 13, 47f, 1.60f, false);

        e.addAluno(a1);
        e.addAluno(a2);
        e.addAluno(a3);
        e.addAluno(a4);

        nut.calcularMetabolismoBasal(a1);
        nut.calcularMetabolismoBasal(a2);
        nut.calcularMetabolismoBasal(a3);
        nut.calcularMetabolismoBasal(a4);

        System.out.println("Escola: " + e.getNomeEscola() + ", " + "Nutricionista responsavel: " + nut.getNome());
        System.out.println("Lista de alunos" + e.getListaAluno());

    }
}

