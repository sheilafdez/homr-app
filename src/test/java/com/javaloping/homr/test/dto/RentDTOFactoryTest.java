package com.javaloping.homr.test.dto;

import com.javaloping.homr.dto.address.AddressDTO;
import com.javaloping.homr.dto.property.RentDTO;
import com.javaloping.homr.dto.property.RentDTOFactory;
import com.javaloping.homr.dto.user.UserDTO;
import com.javaloping.homr.model.Features;
import com.javaloping.homr.model.Rent;
import com.javaloping.homr.model.RentFeatures;
import com.javaloping.homr.model.User;
import com.javaloping.homr.type.PropertyType;
import com.javaloping.homr.type.RentPeriodType;
import com.javaloping.homr.type.RentPriceType;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author victormiranda@gmail.com
 */
public class RentDTOFactoryTest implements DTOFactoryTest<Rent, RentDTOFactory> {

    @Test
    public void testDTOFromModel() {
        final Rent rent = getRentObject();

        final RentDTO rentDTO = RentDTOFactory.dtoFromModel(rent);

        testConversion(rent, rentDTO);
    }

    @Test
    public void testModelFromDTO() {
        final RentDTO dto = getDTOObject();

        final Rent model = RentDTOFactory.modelFromDTO(dto);

        testConversion(model, dto);
    }

    private Rent getRentObject() {
        final Rent rent = new Rent();
        final Features features = new Features();
        final RentFeatures rentFeatures = new RentFeatures();
        final User user = new User();

        rent.setId(10l);
        rent.setName("Cheap Rent");
        rent.setDescription("This is really cheap");
        rent.setPrice(new BigDecimal("1100.55"));
        rent.setDeposit(new BigDecimal("1650"));
        rent.setPriceType(RentPriceType.MONTH);
        rent.setRentPeriod(RentPeriodType.YEAR);
        rent.setPropertyType(PropertyType.FLAT);

        features.setBathrooms(1);
        features.setBathrooms(1);
        features.setFloor(1);
        features.setLift(false);
        features.setSqMeters(45.5f);

        rent.setFeatures(features);

        rentFeatures.setCentralHeating(true);
        rentFeatures.setDishwasher(false);
        rentFeatures.setFurnished(true);
        rentFeatures.setPets(true);

        rent.setRentFeatures(rentFeatures);

        user.setId(1l);
        user.setName("paco");

        rent.setOwner(user);
        return rent;
    }

    private RentDTO getDTOObject() {
        final RentDTO rent = new RentDTO();
        final UserDTO user = new UserDTO();

        final AddressDTO address = new AddressDTO();

        rent.setId(10l);
        rent.setName("Cheap Rent");
        rent.setDescription("This is really cheap");
        rent.setPrice(new BigDecimal("1100.55"));
        rent.setDeposit(new BigDecimal("1650"));
        rent.setPriceType(RentPriceType.MONTH);
        rent.setPeriod(RentPeriodType.YEAR);
        rent.setType(PropertyType.FLAT);

        rent.setBathrooms(1);
        rent.setBathrooms(1);
        rent.setFloor(1);
        rent.setLift(false);
        rent.setSqMeters(45.5f);

        rent.setCentralHeating(true);
        rent.setDishwasher(false);
        rent.setFurniture(true);
        rent.setPets(true);

        user.setId(1L);
        rent.setOwner(user);

        address.setId(1L);
        address.setStreet("Thomas St");
        address.setNumber(118);

        rent.setAddress(address);

        return rent;
    }

    private void testConversion(Rent rent, RentDTO rentDTO) {
        Assert.assertNotNull(rentDTO);

        Assert.assertEquals(rent.getId(), rentDTO.getId());
        Assert.assertEquals(rent.getName(), rentDTO.getName());
        Assert.assertEquals(rent.getDescription(), rentDTO.getDescription());
        Assert.assertEquals(rent.getPriceType(), rentDTO.getPriceType());
        Assert.assertEquals(rent.getRentPeriod(), rentDTO.getPeriod());
        Assert.assertEquals(rent.getPropertyType(), rentDTO.getType());

        Assert.assertEquals(rent.getFeatures().getBathrooms(), rentDTO.getBathrooms());
        Assert.assertEquals(rent.getFeatures().getBedrooms(), rentDTO.getBedrooms());
        Assert.assertEquals(rent.getFeatures().getFloor(), rentDTO.getFloor());
        Assert.assertEquals(rent.getFeatures().getLift(), rentDTO.isLift());
        Assert.assertEquals(rent.getFeatures().getSqMeters(), rentDTO.getSqMeters());

        Assert.assertEquals(rent.getRentFeatures().getCentralHeating(), rentDTO.getCentralHeating());
        Assert.assertEquals(rent.getRentFeatures().getDishwasher(), rentDTO.getDishwasher());
        Assert.assertEquals(rent.getRentFeatures().isFurnished(), rentDTO.getFurniture());
        Assert.assertEquals(rent.getRentFeatures().getPets(), rentDTO.getPets());
    }
}
