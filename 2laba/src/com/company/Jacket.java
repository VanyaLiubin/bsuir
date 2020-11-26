package com.company;

    public class Jacket extends Clothes{

    private String season;
    private boolean availability;

    public Jacket(String manufacturer, int price, String material) {
        super(manufacturer, price, material);
    }

    public Jacket(String manufacturer, int price, String material, String season, boolean availability) {
        super(manufacturer, price, material);
        this.season = season;
        this.availability = availability;
    }

    public String getSeason() {
        return season;
    }

    public boolean getAvailability() {
        return availability;
    }

}






