package org.example;

public class NutricionistaDBTest {

    public static void main(String[] args) {
        NutricionistaCrudRepositorio nutricionista = new NutricionistaCrudRepositorio();

        /*for (Nutricionista item : nutricionista.readAll()) {
            System.out.println(item.toString());
        }
        */
        boolean exists = false;
        for (Nutricionista item : nutricionista.readByName("carne de frango")) {
            exists = true;
            System.out.println(exists);
        }


    }


}
