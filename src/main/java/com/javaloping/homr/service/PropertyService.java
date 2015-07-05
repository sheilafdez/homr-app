package com.javaloping.homr.service;

import com.javaloping.homr.dto.property.RentDTO;

/**
 * @author victormiranda@gmail.com
 */
public interface PropertyService {

    /**
     * Add new rent
     * @param rentDTO
     */
    RentDTO addRent(final RentDTO rentDTO);
}
