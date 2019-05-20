package jpu2016.dogfight.controller;

public class UserOrder implements IUserOrder {

    private int player;

    public Order getorder;


    public UserOrder(int player, Order order){

    }

    public int getPlayer() {
        return player;
    }

    public Order getOrder() {
        return getorder;
    }
}
