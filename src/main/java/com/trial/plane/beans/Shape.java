package com.trial.plane.beans;

import com.trial.plane.AbstractPlane;
import com.trial.plane.Plane;

public class Shape extends AbstractPlane<Shape> implements Plane {

    @Override
    public int areaCalc() {
        return (x*y)/ 2;
    }

    public Shape(AbstractPlaneBuilder<Shape> builder) {
        super(builder);
    }

    public static class Builder extends AbstractPlane.AbstractPlaneBuilder<Shape> {
        @Override
        public Shape build() {
            return new Shape(this);
        }
    }
}
