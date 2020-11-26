package com.company;

class Clothes {

    private String manufacturer;
    private int price;
    private String style;

    public Clothes(String manufacturer, int price, String style) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.style = style;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getStyle() {
        return style;
    }

    public int getPrice() {
        return price;
    }
}