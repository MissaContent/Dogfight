package jpu2016.dogfight.model;

public class Plane extends Mobile{
    int SPEED = 2;
    int WIDHT = 100;
    int HEIGHT = 30;
    int player;


    public Plane(int player, Direction direction, Position position, String image) {
        super(direction, position, image);
    }

    public boolean isPlayer(int player){

    }
    public  boolean hit(){

    }
}
