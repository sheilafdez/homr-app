package com.javaloping.homr.dto.property;

import com.javaloping.homr.type.RentPeriodType;

import java.math.BigDecimal;

/**
 * Created by victor on 04/07/15.
 */
public class RentDTO extends PropertyDTO {

    private BigDecimal deposit;

    private RentPeriodType period;

    private Boolean pets;

    private Boolean furniture;

    private Boolean dishwasher;

    private Boolean centralHeating;

    public BigDecimal getDeposit() {
        return deposit;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }

    public RentPeriodType getPeriod() {
        return period;
    }

    public void setPeriod(RentPeriodType period) {
        this.period = period;
    }

    public Boolean getPets() {
        return pets;
    }

    public void setPets(Boolean pets) {
        this.pets = pets;
    }

    public Boolean getFurniture() {
        return furniture;
    }

    public void setFurniture(Boolean furniture) {
        this.furniture = furniture;
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


}