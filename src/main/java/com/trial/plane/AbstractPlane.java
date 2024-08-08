package com.trial.plane;

public abstract class AbstractPlane<T extends AbstractPlane<T>> implements Plane {
    protected Integer x;

    protected Integer y;

    @Override
    public String getType() {
        return this.getClass().getSimpleName();
    }

    public AbstractPlane(AbstractPlaneBuilder<T> builder) {
        this.x = builder.x;
        this.y = builder.y;
    }

    public abstract static class AbstractPlaneBuilder<T> {

        protected Integer x;

        protected Integer y;

        public AbstractPlaneBuilder<T> addX(int x) {
            this.x = x;
            return this;
        }

        public AbstractPlaneBuilder<T> addY(int y) {
            this.y = y;
            return this;
        }

        public abstract T build();
    }
}
