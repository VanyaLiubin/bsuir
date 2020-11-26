package com.company;

public class Trousers extends Clothes{

    private int length;
    private int wool;

    public Trousers(String manufacturer, int price, String material) {
        super(manufacturer, price, material);
    }

    public Trousers(String manufacturer, int price, String material, int wool, int length) {
        super(manufacturer, price, material);
        this.wool = wool;
        this.length = length;
    }

    public Trousers(String manufacturer, int price, String material, int length) {
        super(manufacturer, price, material);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public int getWool() {
        return wool;
    }
}
