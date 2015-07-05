package com.javaloping.homr.service;

import com.javaloping.homr.dto.property.RentDTO;
import com.javaloping.homr.dto.property.RentDTOFactory;
import com.javaloping.homr.dto.property.SaleDTO;
import com.javaloping.homr.model.Rent;
import com.javaloping.homr.model.Sale;
import com.javaloping.homr.repository.PropertyRepository;
import com.javaloping.homr.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

/**
 * @author victormiranda@gmail.com
 */
@Service
@Transactional
public class PropertyServiceImpl implements PropertyService {

    @Resource
    private PropertyRepository propertyRepository;

    @Resource
    private UserRepository userRepository;

    public RentDTO addRent(RentDTO rentDTO) {
        final Rent rent = loadFromAddRentDTO(rentDTO);

        propertyRepository.save(rent);

        return RentDTOFactory.create(rent);
    }

    private Rent loadFromAddRentDTO(RentDTO rentDTO) {
        final Rent rent = new Rent();

        rent.setName(rentDTO.getName());
        rent.setDescription(rentDTO.getDescription());
        rent.setPrice(rentDTO.getPrice());
        rent.setDeposit(rentDTO.getDeposit());

        if (rentDTO.getOwner() != null) {
            rent.setOwner(userRepository.findOne(rentDTO.getOwner().getId()));
        }

        return rent;
    }

    public void addSale(SaleDTO saleDTO) {
        Sale sale = new Sale();

        propertyRepository.save(sale);
    }
}
