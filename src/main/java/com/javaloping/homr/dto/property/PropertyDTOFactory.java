package com.javaloping.homr.dto.property;

import com.javaloping.homr.dto.address.AddressDTO;
import com.javaloping.homr.dto.address.AddressDTOFactory;
import com.javaloping.homr.dto.user.UserDTO;
import com.javaloping.homr.dto.user.UserDTOFactory;
import com.javaloping.homr.model.*;

/**
 * @author victormiranda@gmail.com
 */
public class PropertyDTOFactory {

    public static PropertyDTO dtoFromModel(final Property model) {
        final PropertyDTO property;

        if (model instanceof Rent) {
            property = new RentDTO();
        } else {
            property = new SaleDTO();
        }

        property.setId(model.getId());
        property.setName(model.getName());
        property.setDescription(model.getDescription());
        property.setSqMeters(model.getFeatures().getSqMeters());
        property.setBathrooms(model.getFeatures().getBathrooms());
        property.setBedrooms(model.getFeatures().getBedrooms());
        property.setFloor(model.getFeatures().getFloor());
        property.setLift(model.getFeatures().getLift());
        property.setType(model.getPropertyType());

        property.setPrice(model.getPrice());

        if (model.getOwner() != null) {
            final UserDTO user = UserDTOFactory.create(model.getOwner());
            property.setOwner(user);
        }

        if (model.getAddress() != null) {
            final AddressDTO addressDTO = AddressDTOFactory.dtoFromModel(model.getAddress());
            property.setAddress(addressDTO);
        }

        return property;
    }

    public static Property modelFromDTO(RentDTO dto) {
        final Property property;

        if (dto instanceof RentDTO) {
            property = new Rent();
        } else {
            property = new Sale();
        }

        property.setId(dto.getId());

        property.setAddress(AddressDTOFactory.modelFromDTO(dto.getAddress()));

        property.setPropertyType(dto.getType());
        property.setName(dto.getName());
        property.setDescription(dto.getDescription());
        property.setPrice(dto.getPrice());

        if (dto.getOwner() != null) {
            User user = new User();
            user.setId(dto.getOwner().getId());
            property.setOwner(user);
        }

        final Features features = new Features();

        features.setSqMeters(dto.getSqMeters());
        features.setBathrooms(dto.getBathrooms());
        features.setBedrooms(dto.getBedrooms());
        features.setFloor(dto.getFloor());
        features.setLift(dto.isLift());

        property.setFeatures(features);

        return property;
    }
}
