package com.javaloping.homr.dto.property;

import com.javaloping.homr.dto.address.AddressDTO;
import com.javaloping.homr.dto.address.AddressDTOFactory;
import com.javaloping.homr.dto.user.UserDTO;
import com.javaloping.homr.dto.user.UserDTOFactory;
import com.javaloping.homr.model.Property;
import com.javaloping.homr.model.Rent;

/**
 * @author victormiranda@gmail.com
 */
public class PropertyDTOFactory {

    public static PropertyDTO create(final Property model) {
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
        property.setBedrooms(model.getFeatures().getBathrooms());
        property.setFloor(model.getFeatures().getFloor());
        property.setType(model.getPropertyType());

        property.setPrice(model.getPrice());

        final UserDTO user = UserDTOFactory.create(model.getOwner());
        property.setOwner(user);

        final AddressDTO addressDTO = AddressDTOFactory.create(model.getAddress());

        property.setAddress(addressDTO);

        return property;
    }
}
