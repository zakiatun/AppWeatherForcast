package com.zakiatun.cuacanya.model;

public class Sys {
    private int type ;
    private int id ;
    private double message ;
    private String country ;
    private int sunrise ;
    private int sunset ;

    public Sys() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMessage() {
        return message;
    }

    public int getSunrise() {
        return sunrise;
    }

    public int getSunset() {
        return sunset;
    }

    public int getType() {
        return type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setMessage(double message) {
        this.message = message;
    }

    public void setSunrise(int sunrise) {
        this.sunrise = sunrise;
    }

    public void setSunset(int sunset) {
        this.sunset = sunset;
    }
}
