package jpu2016.dogfight.model;

import java.awt.*;

public class Sky implements IArea {

    private Dimension dimension;

    public Sky(Dimension dimension) {


    }

    public Dimension getDimension() {
        return dimension;
    }

    @Override
    public Image getImage() {
        return null;
    }
}
