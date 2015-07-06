package com.javaloping.homr.test.dto;

import com.javaloping.homr.dto.address.AddressDTO;
import com.javaloping.homr.dto.address.AddressDTOFactory;
import com.javaloping.homr.dto.address.AreaDTO;
import com.javaloping.homr.dto.address.CountryDTO;
import com.javaloping.homr.model.Address;
import com.javaloping.homr.model.Area;
import com.javaloping.homr.model.Country;
import junit.framework.Assert;
import org.junit.Test;

/**
 * @author victormiranda@gmail.com
 */
public class AddressDTOFactoryTest implements DTOFactoryTest<Address, AddressDTO> {

    @Test
    public void testModelFromDTO() {
        final AddressDTO addressDTO = getDTOObject();
        final Address address = AddressDTOFactory.modelFromDTO(addressDTO);

        testConversion(address, addressDTO);
    }
    
    @Test
    public void testDTOFromModel() {
        final Address address = getModelObject();
        final AddressDTO addressDTO = AddressDTOFactory.dtoFromModel(address);

        testConversion(address, addressDTO);
    }

    private Address getModelObject() {
        final Address model = new Address();
        final Area area = new Area();
        final Country country = new Country();

        country.setId(4L);
        country.setName("S-Pain");

        area.setId(1L);
        area.setName("Dublin");
        area.setCountry(country);

        model.setId(1L);
        model.setStreet("Thomas st");
        model.setNumber(17);
        model.setArea(area);

        return model;
    }

    private void testConversion(Address model, AddressDTO dto) {
        Assert.assertEquals(model.getId(), dto.getId());
        Assert.assertEquals(model.getStreet(), dto.getStreet());
        Assert.assertEquals(model.getNumber(), dto.getNumber());
        Assert.assertEquals(model.getArea().getId(), dto.getArea().getId());
        Assert.assertEquals(model.getArea().getName(), dto.getArea().getName());
    }

    private AddressDTO getDTOObject() {
        final AddressDTO addressDTO = new AddressDTO();
        final AreaDTO area = new AreaDTO();
        final CountryDTO country = new CountryDTO();

        country.setId(1L);
        country.setName("Ireland");

        area.setId(1L);
        area.setName("Dundrum");
        area.setCountryDTO(country);

        addressDTO.setId(1L);
        addressDTO.setStreet("Thomas St");
        addressDTO.setNumber(118);
        addressDTO.setArea(area);

        return addressDTO;
    }


}
