package org.example;

import java.util.List;

public class Despensa {
    private String nome;


    public Despensa() {

    }

    public Despensa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "{" +
                " alimento='" + getNome() + "'" +
                "}";
    }

}

