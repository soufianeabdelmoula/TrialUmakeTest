package com.trial;

import com.trial.node.Node;
import com.trial.plane.beans.Square;
import com.trial.plane.beans.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

        Triangle triangle1 = new Triangle.Builder()
                .addX(5)
                .addY(20)
                .build();

        Triangle triangle2 = new Triangle.Builder()
                .addX(60)
                .addY(320)
                .build();


        // Calculer l'aire pour les carrés et les triangles
        // et afficher le résultat


        // Ici je voudrais filtrer les éléments qui ont une aire < 250
        // Ensuite je voudrais afficher la taille de liste par type d'élément.

    }

    @Test
    public void find_pair_and_impair_number() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7);

        Map<Boolean, List<Integer>> partitionedNumbers = new HashMap<>();

        Assertions.assertEquals(4, partitionedNumbers.get(false).size());
        Assertions.assertEquals(3, partitionedNumbers.get(true).size());
    }

    @Test
    public void find_exist_element_in_text() {
        final String strElement = "pas";
        final String text = "Je crois avoir passé le chemin, mais je ne suis pas sûr";

        // Ici je voudrais vérifier si le texte contient le mot search
        Assertions.assertEquals(1, findOccurrenceElement(strElement, text));
    }

    @Test
    public void build_tree_node() {
        List<BigInteger> numbers = List.of(BigInteger.valueOf(2), BigInteger.valueOf(4), BigInteger.valueOf(5), BigInteger.valueOf(10), BigInteger.valueOf(3), BigInteger.valueOf(7));

        Node root = new Node();
        root.setValue(BigInteger.valueOf(1));

        buildTree(numbers, root);

        Assertions.assertEquals(BigInteger.valueOf(2), root.getLeft().getValue());
        Assertions.assertEquals(BigInteger.valueOf(7), root.getRight().getRight().getValue());
    }

    public static void buildTree(final List<BigInteger> numbers, Node node) {

    }

    public int findOccurrenceElement(final String strElement, final String text) {
        return 1;
    }


}
