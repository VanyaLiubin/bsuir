package com.company;
public class Blouse extends Clothes{

    private boolean frame;

    public Blouse(String manufacturer, int price, String material) {
        super(manufacturer, price, material);
    }

    public Blouse(String manufacturer, int price, String material, boolean frame) {
        super(manufacturer, price, material);
        this.frame = frame;
    }

    public Blouse(int price, String material, boolean frame) {
        super(material, price, material);
        this.frame = frame;
    }

    public boolean getFrame() {
        return frame;
    }
}