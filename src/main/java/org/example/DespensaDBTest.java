package org.example;

import com.mongodb.client.MongoCollection;

public class DespensaDBTest {

    public static void main(String[] args) {
        DespensaCrudRepositorio despensa = new DespensaCrudRepositorio();

        /*for (Despensa item : despensa.readAll()) {
            System.out.println(item.toString());
        }
        */

        for (Despensa item : despensa.readByType("arroz")) {
            System.out.println(item.toString());
        }


    }
}
