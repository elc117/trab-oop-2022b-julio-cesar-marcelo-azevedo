package org.example;

public class MongoDBTeste {

    public static void main(String[] args) {
        DespensaCrudRepositorio despensa = new DespensaCrudRepositorio();

        for (Despensa item : despensa.readAll()) {
            System.out.println(item.toString());
        }
    }
}
