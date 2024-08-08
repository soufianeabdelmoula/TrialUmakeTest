package com.trial.plane.beans;

import com.trial.plane.AbstractPlane;
import com.trial.plane.Plane;

public class Triangle extends AbstractPlane<Triangle> implements Plane {

    @Override
    public int areaCalc() {
        return (x*y)/ 2;
    }

    public Triangle(AbstractPlaneBuilder<Triangle> builder) {
        super(builder);
    }

    public static class Builder extends AbstractPlane.AbstractPlaneBuilder<Triangle> {
        @Override
        public Triangle build() {
            return new Triangle(this);
        }
    }
}
