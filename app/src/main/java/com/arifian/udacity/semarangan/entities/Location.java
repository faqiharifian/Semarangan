package com.arifian.udacity.semarangan.entities;

/**
 * Created by faqih on 15/04/17.
 */

public class Location {
    private int name, image, description, latitude, logintude;

    public Location(int name, int image, int description, int latitude, int logintude) {
        this.name = name;
        this.image = image;
        this.description = description;
        this.latitude = latitude;
        this.logintude = logintude;
    }

    public int getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public int getDescription() {
        return description;
    }

    public int getLatitude() {
        return latitude;
    }

    public int getLogintude() {
        return logintude;
    }
}
