package com.javaloping.homr.dto.property;

import com.javaloping.homr.dto.address.AddressDTOFactory;
import com.javaloping.homr.model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    public static Rent create(final RentDTO dto) {
        final Rent rent = new Rent();

        final Address address = AddressDTOFactory.create(dto.getAddress());

        rent.setAddress(address);

        rent.setRentPeriod(dto.getPeriod());

        rent.setPropertyType(dto.getType());
        rent.setName(dto.getName());
        rent.setDescription(dto.getDescription());
        rent.setPrice(dto.getPrice());
        rent.setDeposit(dto.getDeposit());

        if (dto.getOwner() != null) {
            User user = new User();
            user.setId(dto.getOwner().getId());
            rent.setOwner(user);
        }

        final Features features = new Features();
        final RentFeatures rentFeatures= new RentFeatures();

        features.setSqMeters(dto.getSqMeters());
        features.setBathrooms(dto.getBathrooms());
        features.setBedrooms(dto.getBedrooms());
        features.setFloor(dto.getFloor());

        rentFeatures.setPets(dto.getPets());
        rentFeatures.setDishwasher(dto.getDishwasher());
        rentFeatures.setFurnished(dto.getFurniture());
        rentFeatures.setCentralHeating(dto.getCentralHeating());

        rent.setFeatures(features);
        rent.setRentFeatures(rentFeatures);

        rent.setPropertyHistories(loadCreationLog(rent));

        return rent;
    }

    private static List<PropertyHistory> loadCreationLog(Rent rent) {
        List<PropertyHistory> propertyHistoryList = new ArrayList<PropertyHistory>(1);

        PropertyHistory creationLog = new PropertyHistory();
        Date now = new Date();

        creationLog.setCreateDate(now);
        creationLog.setModifyDate(now);
        creationLog.setDescription("Rent added");

        propertyHistoryList.add(creationLog);
        creationLog.setProperty(rent);

        return  propertyHistoryList;
    }


}