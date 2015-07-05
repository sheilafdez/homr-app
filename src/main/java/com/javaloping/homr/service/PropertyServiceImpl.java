package com.javaloping.homr.service;

import com.javaloping.homr.dto.property.RentDTO;
import com.javaloping.homr.dto.property.RentDTOFactory;
import com.javaloping.homr.dto.property.SaleDTO;
import com.javaloping.homr.model.*;
import com.javaloping.homr.repository.AddressRepository;
import com.javaloping.homr.repository.AreaRepository;
import com.javaloping.homr.repository.PropertyRepository;
import com.javaloping.homr.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.Date;

/**
 * @author victormiranda@gmail.com
 */
@Service
@Transactional
public class PropertyServiceImpl implements PropertyService {

    @Resource
    private PropertyRepository propertyRepository;

    @Resource
    private AddressRepository addressRepository;

    @Resource
    private AreaRepository areaRepository;

    @Resource
    private UserRepository userRepository;

    public RentDTO addRent(RentDTO rentDTO) {
        final Rent rent = loadFromAddRentDTO(rentDTO);

        final Date now = new Date();

        rent.setCreateDate(now);
        rent.setModifyDate(now);

        rent.getAddress().setCreateDate(now);
        rent.getAddress().setModifyDate(now);

        propertyRepository.save(rent);

        return RentDTOFactory.create(rent);
    }

    private Rent loadFromAddRentDTO(RentDTO rentDTO) {
        final Rent rent = new Rent();

        final Address address = loadAddressFromAddRentDTO(rentDTO);
        final Features features = new Features();
        final RentFeatures rentFeatures= new RentFeatures();

        rent.setFeatures(features);
        rent.setRentFeatures(rentFeatures);
        rent.setAddress(address);

        rent.setRentPeriod(rentDTO.getPeriod());

        rent.setPropertyType(rentDTO.getType());
        rent.setName(rentDTO.getName());
        rent.setDescription(rentDTO.getDescription());
        rent.setPrice(rentDTO.getPrice());
        rent.setDeposit(rentDTO.getDeposit());

        if (rentDTO.getOwner() != null) {
            rent.setOwner(userRepository.findOne(rentDTO.getOwner().getId()));
        }

        features.setSqMeters(rentDTO.getSqMeters());
        features.setBathrooms(rentDTO.getBathrooms());
        features.setBedrooms(rentDTO.getBedrooms());
        features.setFloor(rentDTO.getFloor());

        rentFeatures.setPets(rentDTO.getPets());
        rentFeatures.setDishwasher(rentDTO.getDishwasher());
        rentFeatures.setFurnished(rentDTO.getFurniture());
        rentFeatures.setCentralHeating(rentDTO.getCentralHeating());

        return rent;
    }

    private Address loadAddressFromAddRentDTO(RentDTO rentDTO) {
        final Address address = new Address();

        final Area area = areaRepository.findOne(rentDTO.getAddress().getArea().getId());

        address.setArea(area);
        address.setStreet(rentDTO.getAddress().getStreet());

        return address;
    }

    public void addSale(SaleDTO saleDTO) {
        Sale sale = new Sale();

        propertyRepository.save(sale);
    }
}
