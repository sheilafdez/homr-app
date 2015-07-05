package com.javaloping.homr.model;

import javax.persistence.Embeddable;

/**
 * @author victormiranda@gmail.com
 */
@Embeddable
public class RentFeatures {
    private Boolean pets;

    private Boolean dishwasher;

    private Boolean centralHeating;

    private boolean furnished;

    public Boolean getPets() {
        return pets;
    }

    public void setPets(Boolean pets) {
        this.pets = pets;
    }

    public Boolean getDishwasher() {
        return dishwasher;
    }

    public void setDishwasher(Boolean dishwasher) {
        this.dishwasher = dishwasher;
    }

    public Boolean getCentralHeating() {
        return centralHeating;
    }

    public void setCentralHeating(Boolean centralHeating) {
        this.centralHeating = centralHeating;
    }

    public boolean isFurnished() {
        return furnished;
    }

    public void setFurnished(boolean furnished) {
        this.furnished = furnished;
    }
}
