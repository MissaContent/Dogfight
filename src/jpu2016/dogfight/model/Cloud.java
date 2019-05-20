package jpu2016.dogfight.model;

public class Cloud extends Mobile{
    int SPEED = 1;
    int WIDTH = 300;
    int HEIGHT = 150;
    String IMAGE = "cloud";


    public Cloud(Direction direction, Dimension dimension){
        super(direction, position, dimension, speed, String image);

    }
}
