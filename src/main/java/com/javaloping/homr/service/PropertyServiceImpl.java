package com.javaloping.homr.service;

import com.javaloping.homr.dto.proper.RentDTO;
import com.javaloping.homr.dto.proper.SaleDTO;
import com.javaloping.homr.model.Rent;
import com.javaloping.homr.model.Sale;
import com.javaloping.homr.repository.PropertyRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

/**
 * Created by victor on 04/07/15.
 */
@Service
@Transactional
public class PropertyServiceImpl implements PropertyService {

    @Resource
    private PropertyRepository propertyRepository;

    public void addRent(RentDTO rentDTO) {
        Rent rent = new Rent();

        propertyRepository.save(rent);
    }

    public void addSale(SaleDTO saleDTO) {
        Sale sale = new Sale();

        propertyRepository.save(sale);
    }
}
