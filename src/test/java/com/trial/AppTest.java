package com.trial;

import com.trial.plane.beans.Shape;
import com.trial.plane.beans.Square;
import com.trial.plane.Plane;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


public class AppTest {


    @Test
    public void testApp() {

        Square square1 = new Square.Builder()
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

        Shape shape = new Shape.Builder()
                .addX(5)
                .addY(20)
                .build();

        Shape shape2 = new Shape.Builder()
                .addX(60)
                .addY(320)
                .build();

        List<Plane> planes = new ArrayList<>();

        planes.add(square1);
        planes.add(square2);
        planes.add(square3);
        planes.add(shape);
        planes.add(shape2);

        List<Plane> planesSup250 = new ArrayList<>();

        for (Plane plane : planes) {
            if (plane.areaCalc() > 250 ) {
                planesSup250.add(plane);
            }
        }

        Assert.assertEquals(3, planesSup250.size());

        List<String> planesNames = new ArrayList<>();

        for (Plane plane : planes) {
            planesNames.add(plane.getType());
        }

        Assert.assertEquals("Shape", planesNames.get(3));
    }
}
