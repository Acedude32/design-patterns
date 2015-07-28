package com.smulsky.patterns.builder.second;


public class Airplane {
    private final Type type;
    private Color color;
    private int width;
    private long maxDistance;
    private int crew;

    public Airplane(Builder builder) {
        this.type = builder.type;
        this.color = builder.color;
        this.width = builder.width;
        this.maxDistance = builder.maxDistance;
        this.crew = builder.crew;

    }

    public Type getType() {
        return type;
    }

    public Color getColor() {
        return color;
    }

    public int getWidth() {
        return width;
    }

    public long getMaxDistance() {
        return maxDistance;
    }

    public int getCrew() {
        return crew;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "type=" + type +
                ", color=" + color +
                ", width=" + width +
                ", maxDistance=" + maxDistance +
                ", crew=" + crew +
                '}';
    }

    public static class Builder{
        private final Type type;
        private Color color;
        private int width;
        private long maxDistance;
        private int crew;

        public Builder(Type type) {
            this.type = type;
        }


        public Builder color(Color color) {
            this.color = color;
            return this;
        }

        public Builder width(int width) {
            this.width = width;
            return this;
        }

        public Builder distance(long maxDistance) {
            this.maxDistance = maxDistance;
            return this;
        }

        public Builder crew(int crew) {
            this.crew = crew;
            return this;
        }

        public Airplane build(){
            return new Airplane(this);
        }
    }
}
