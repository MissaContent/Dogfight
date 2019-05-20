package jpu2016.dogfight.view;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.model.IDogfightModel;

import java.util.Observable;

public class DogfightView {

    public DogfightView(IOrderPerformer orderPerformer, IDogfightModel dogfightModel, Observable observable){}

    private void run(){}

    public displayMessage(String message)
    {
        System.out.println(" test");
    }
    public void closeALL(){}


}
