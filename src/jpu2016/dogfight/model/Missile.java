package jpu2016.dogfight.model;

public class Missile extends Mobile{
    int SPEED = 4;
    int WIDHT = 30;
    int HEIGHT = 10;
    int MAX_DISTANCE_TRAVELED = 1400;
    String IMAGE = "missile";
    int distanceTraveled = 0;


    public Missile(Direction direction, Dimension dimension) {
        super();

    }

    public int getWIDHTWithADirection(Direction direction) {
        return WIDHT;
    }

    public int getHEIGHTWithADirection(Direction direction) {
        return HEIGHT;
    }
    public void move(){

    }
    public boolean isWeapon(){

    }
}
