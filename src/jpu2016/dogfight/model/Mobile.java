package jpu2016.dogfight.model;

public class Mobile implements IMobile {
    private int speed;

    private Dimension dimension;

    public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image){
    }

    public Dimension getDimension() {
        return dimension;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public Direction getDirection() {
        return null;
    }
}
