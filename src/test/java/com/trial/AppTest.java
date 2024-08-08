package com.trial;

import com.trial.plane.beans.Triangle;
import com.trial.plane.beans.Square;
import org.junit.jupiter.api.Test;

public class AppTest {


    @Test
    public void testApp() {

        final Square square1 = new Square.Builder()
                .addX(10)
                .addY(20)
                .build();

        Square square2 = new Square.Builder()
                .addX(20)
                .addY(40)
                .build();

        Square square3 = new Square.Builder()
                .addX(10)
                .addY(50)
                .build();

        Triangle shape = new Triangle.Builder()
                .addX(5)
                .addY(20)
                .build();

        Triangle shape2 = new Triangle.Builder()
                .addX(60)
                .addY(320)
                .build();


        // calculer l'air pour les squares et les triangles et les afficher dans la console


        // Ici je voudrais filtrer les éléments qui ont une aires > 250 et les ajouter dans une listes pour l'afficher dans leurs types



    }
}
