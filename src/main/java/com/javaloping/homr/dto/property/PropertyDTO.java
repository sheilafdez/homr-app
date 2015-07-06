package com.javaloping.homr.dto.property;

import com.javaloping.homr.dto.address.AddressDTO;
import com.javaloping.homr.dto.user.UserDTO;

import java.math.BigDecimal;

/**
 * @author victormiranda@gmail.com
 */
public abstract class PropertyDTO extends BasicPropertyDTO {

    private String description;

    private BigDecimal price;

    private AddressDTO address;

    private UserDTO owner;

    private Float sqMeters;

    private int bedrooms;

    private int bathrooms;

    private Integer floor;

    private Boolean lift;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }

    public UserDTO getOwner() {
        return owner;
    }

    public void setOwner(UserDTO owner) {
        this.owner = owner;
    }

    public Float getSqMeters() {
        return sqMeters;
    }

    public void setSqMeters(Float sqMeters) {
        this.sqMeters = sqMeters;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getFloor() {
        return floor;
    }

    public Boolean isLift() {
        return lift;
    }

    public void setLift(Boolean lift) {
        this.lift = lift;
    }
}
