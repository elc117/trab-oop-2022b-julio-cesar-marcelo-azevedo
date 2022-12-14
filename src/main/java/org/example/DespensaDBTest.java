package org.example;

public class DespensaDBTest {

    public static void main(String[] args) {
        DespensaCrudRepositorio despensa = new DespensaCrudRepositorio();

        for (Despensa item : despensa.readAll()) {
            System.out.println(item.toString());
        }



        //despensa.readByType("carboidrato");
    }
}
