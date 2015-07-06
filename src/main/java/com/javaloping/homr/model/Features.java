package com.javaloping.homr.model;

import javax.persistence.Embeddable;

/**
 * @author victormiranda@gmail.com
 */
@Embeddable
public class Features {

    private Integer floor;

    private Float sqMeters;

    private int bedrooms;

    private int bathrooms;

    private Boolean lift;

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Float getSqMeters() {
        return sqMeters;
    }

    public void setSqMeters(Float sqMeters) {
        this.sqMeters = sqMeters;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public Boolean getLift() {
        return lift;
    }

    public void setLift(Boolean lift) {
        this.lift = lift;
    }
}
