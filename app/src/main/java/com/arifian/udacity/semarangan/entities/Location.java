package com.arifian.udacity.semarangan.entities;

import java.io.Serializable;

/**
 * Created by faqih on 15/04/17.
 */

public class Location implements Serializable {
    private int name, category, image, description, latitude, longitude;

    public Location(int name, int image, int description, int latitude, int longitude) {
        this.name = name;
        this.image = image;
        this.description = description;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Location(int name, int category, int image, int description, int latitude, int longitude) {
        this.name = name;
        this.category = category;
        this.image = image;
        this.description = description;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public int getName() {
        return name;
    }

    public int getCategory() {
        return category;
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

    public int getLongitude() {
        return longitude;
    }
}
