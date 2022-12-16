package org.example;

import java.util.ArrayList;

public class Nutricionista {

    private String nome;
    private int calorias;
    private float peso;

    private String tipo;

    ArrayList<String> dietaGeral;


    public Nutricionista() {
        this.dietaGeral = new ArrayList<String>();
    }

    public Nutricionista(String nome) {
        this.nome = nome;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    private String getTipo() {
        return tipo;
    }

    private void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void calcularMetabolismoBasal(Pessoa aluno) {
        double Kcal = 0;
        //Homens
        if (aluno.getSexo() == 'm') {
            Kcal = 66 + (13.7 * aluno.getPeso()) + (5.0 * (aluno.getAltura() * 100)) - (6.8 * aluno.getIdade());

        }

        //Mulheres
        else {
            Kcal = 665 + (9.6 * aluno.getPeso()) + (1.8 * (aluno.getAltura() * 100)) - (4.7 * aluno.getIdade());

        }
        aluno.setTxMetabolicaBasal(Kcal);
    }

    public void setDietaGeral(DespensaCrudRepositorio despensa, NutricionistaCrudRepositorio nutricionista) {

        //Proteina
        for (Despensa item : despensa.readByType("proteina")) {
            if (item.getNome() == "carne de frango") {
                dietaGeral.add("carne de frango");
            } else if (item.getNome() == "carne de porco") {
                dietaGeral.add("carne de frango");
            } else {
                dietaGeral.add(item.getNome());

            }
        }

        for (Despensa item : despensa.readByType("carboidrato")) {
            if (item.getNome() == "batata") {
                dietaGeral.add("batata");
            } else if (item.getNome() == "lentilha") {
                dietaGeral.add("lentilha");
            } else {
                dietaGeral.add(item.getNome());
            }
        }

        for (Despensa item : despensa.readByType("legume")) {
            if (item.getNome() == "brocolis") {
                dietaGeral.add("brocolis");
            } else if (item.getNome() == "cenoura") {
                dietaGeral.add("cenoura");
            } else {
                dietaGeral.add(item.getNome());
            }
        }

    }

    public ArrayList<String> getDietaGeral() {
        ArrayList<String> dieta = new ArrayList<String>();
        for (String a : dietaGeral) {
            dieta.add(a.toString());
        }
        return dieta;
    }

    /*public ArrayList<Nutricionista> getDietaGeral() {
        ArrayList<Nutricionista> dietaGeral = new ArrayList<Nutricionista>();
        for (Nutricionista n : dietaGeral) {
            dietaGeral.add(n.getDietaGeral());
        }
        return dietaGeral;
    }
    */


    public String toString() {
        return "{" +
                " alimento='" + getNome() + "'" +
                "}" + " tipo='" + getTipo() + "'" +
                " calorias='" + getCalorias() + "'" +
                "peso=" + getPeso();
    }

}

