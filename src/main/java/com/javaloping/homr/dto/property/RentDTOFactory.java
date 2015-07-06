package com.javaloping.homr.dto.property;

import com.javaloping.homr.model.Rent;
import com.javaloping.homr.model.RentFeatures;

/**
 * @author victormiranda@gmail.com
 */
public class RentDTOFactory {

    public static RentDTO dtoFromModel(final Rent model) {
        final RentDTO rent = (RentDTO) PropertyDTOFactory.dtoFromModel(model);

        rent.setDeposit(model.getDeposit());
        rent.setFurniture(model.getRentFeatures().isFurnished());
        rent.setDishwasher(model.getRentFeatures().getDishwasher());
        rent.setPets(model.getRentFeatures().getPets());
        rent.setCentralHeating(model.getRentFeatures().getCentralHeating());
        rent.setPeriod(model.getRentPeriod());
        rent.setPriceType(model.getPriceType());

        return rent;
    }

    public static Rent modelFromDTO(final RentDTO dto) {
        final Rent rent = (Rent) PropertyDTOFactory.modelFromDTO(dto);
        final RentFeatures rentFeatures = loadRentFeatures(dto);

        rent.setRentPeriod(dto.getPeriod());
        rent.setDeposit(dto.getDeposit());
        rent.setRentFeatures(rentFeatures);
        rent.setPriceType(dto.getPriceType());

        return rent;
    }

    private static RentFeatures loadRentFeatures(RentDTO dto) {
        final RentFeatures rentFeatures= new RentFeatures();

        rentFeatures.setPets(dto.getPets());
        rentFeatures.setDishwasher(dto.getDishwasher());
        rentFeatures.setFurnished(dto.getFurniture());
        rentFeatures.setCentralHeating(dto.getCentralHeating());

        return rentFeatures;
    }


}