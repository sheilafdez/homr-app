package com.javaloping.homr.dto.property;

import com.javaloping.homr.type.RentPeriodType;

import java.math.BigDecimal;

/**
 * Created by victor on 04/07/15.
 */
public class RentDTO extends PropertyDTO {

    private BigDecimal deposit;

    private RentPeriodType period;

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

}