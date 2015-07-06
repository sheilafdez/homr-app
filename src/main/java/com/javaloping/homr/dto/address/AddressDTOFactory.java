package com.javaloping.homr.dto.address;

import com.javaloping.homr.model.Address;
import com.javaloping.homr.model.Area;

/**
 * @author victormiranda@gmail.com
 */
public class AddressDTOFactory {
    public static AddressDTO dtoFromModel(final Address model) {
        final AddressDTO address = new AddressDTO();

        address.setId(model.getId());
        address.setStreet(model.getStreet());
        address.setNumber(model.getNumber());

        AreaDTO area = loadAreaFromAddress(model.getArea());

        address.setArea(area);

        return address;
    }

    public static Address modelFromDTO(final AddressDTO addressDTO) {
        final Address address = new Address();

        address.setId(addressDTO.getId());

        if (addressDTO.getArea() != null) {
            final Area area = new Area();
            area.setId(addressDTO.getArea().getId());
            area.setName(addressDTO.getArea().getName());

            address.setArea(area);
        }
        address.setStreet(addressDTO.getStreet());
        address.setNumber(addressDTO.getNumber());

        return address;
    }

    private static AreaDTO loadAreaFromAddress(Area model) {
        AreaDTO area = new AreaDTO();
        area.setId(model.getId());
        area.setName(model.getName());

        CountryDTO countryDTO = new CountryDTO();
        countryDTO.setId(model.getCountry().getId());
        countryDTO.setName(model.getCountry().getName());

        if (model.getParent() != null) {
            area.setParent(loadAreaFromAddress(model.getParent()));
        }

        area.setCountryDTO(countryDTO);
        return area;
    }
}
