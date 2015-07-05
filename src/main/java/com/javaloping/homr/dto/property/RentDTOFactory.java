package com.javaloping.homr.dto.property;

import com.javaloping.homr.model.Rent;

/**
 * @author victormiranda@gmail.com
 */
public class RentDTOFactory {

    public static RentDTO create(final Rent model) {
        final RentDTO rent = (RentDTO) PropertyDTOFactory.create(model);

        rent.setDeposit(model.getDeposit());
        rent.setFurniture(model.getRentFeatures().isFurnished());
        rent.setDishwasher(model.getRentFeatures().getDishwasher());
        rent.setPets(model.getRentFeatures().getPets());
        rent.setCentralHeating(model.getRentFeatures().getCentralHeating());
        rent.setPeriod(model.getRentPeriod());

        return rent;
    }
}