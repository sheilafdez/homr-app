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
    private UserRepository userRepository;

    public RentDTO addRent(RentDTO rentDTO) {
        final Rent rent = RentDTOFactory.create(rentDTO);

        final Date now = new Date();

        rent.setCreateDate(now);
        rent.setModifyDate(now);

        rent.getAddress().setCreateDate(now);
        rent.getAddress().setModifyDate(now);

        propertyRepository.save(rent);

        Rent rentSavedPopulated = (Rent)propertyRepository.findOne(rent.getId());

        return RentDTOFactory.create(rentSavedPopulated);
    }

    public void addSale(SaleDTO saleDTO) {
        Sale sale = new Sale();

        propertyRepository.save(sale);
    }
}
