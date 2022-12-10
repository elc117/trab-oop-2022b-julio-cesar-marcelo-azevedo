package org.example;

import java.util.List;
public class Despensa {
    private String nome;

    private String tipo;

    public Despensa(){

    }

    public Despensa(String nome, String tipo){
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


}

