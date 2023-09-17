package com.trial.plane.beans;

import com.trial.plane.AbstractPlane;
import com.trial.plane.Plane;

public class Square extends AbstractPlane<Square> implements Plane {

    @Override
    public int areaCalc() {
        return x*y;
    }

    public Square(AbstractPlaneBuilder<Square> builder) {
        super(builder);
    }

    public static class Builder extends AbstractPlane.AbstractPlaneBuilder<Square> {
        @Override
        public Square build() {
            return new Square(this);
        }
    }
}
