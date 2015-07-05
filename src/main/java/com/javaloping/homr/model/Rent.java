package com.javaloping.homr.model;

import com.javaloping.homr.type.RentPeriodType;
import com.javaloping.homr.type.RentPriceType;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by victor on 04/07/15.
 */
@Entity
@DiscriminatorValue("rent")
public class Rent extends Property {

    private RentPeriodType rentPeriod;

    @Enumerated(EnumType.STRING)
    private RentPriceType priceType;

    private Boolean pets;

    private Boolean dishwasher;

    private boolean furnished;

    @Column( precision = 10, scale = 2, columnDefinition="DECIMAL(10,2)")
    private BigDecimal deposit;

    public RentPeriodType getRentPeriod() {
        return rentPeriod;
    }

    public void setRentPeriod(RentPeriodType rentPeriod) {
        this.rentPeriod = rentPeriod;
    }

    public RentPriceType getPriceType() {
        return priceType;
    }

    public void setPriceType(RentPriceType priceType) {
        this.priceType = priceType;
    }

    public Boolean isPets() {
        return pets;
    }

    public void setPets(Boolean pets) {
        this.pets = pets;
    }

    public Boolean isDishwasher() {
        return dishwasher;
    }

    public void setDishwasher(Boolean dishwasher) {
        this.dishwasher = dishwasher;
    }

    public boolean isFurnished() {
        return furnished;
    }

    public void setFurnished(boolean furnished) {
        this.furnished = furnished;
    }

    public BigDecimal getDeposit() {
        return deposit;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }
}
