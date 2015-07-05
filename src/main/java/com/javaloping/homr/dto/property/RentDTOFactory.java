package com.javaloping.homr.dto.property;

import com.javaloping.homr.model.Rent;

/**
 * @author victormiranda@gmail.com
 */
public class RentDTOFactory {

    public static RentDTO create(final Rent model) {
        final RentDTO rent = (RentDTO) PropertyDTOFactory.create(model);

        return rent;
    }
}