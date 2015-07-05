package com.javaloping.homr.service;

import com.javaloping.homr.dto.proper.RentDTO;

/**
 * Created by victor on 04/07/15.
 */
public interface PropertyService {

    /**
     * Add new rent
     * @param rentDTO
     */
    void addRent(final RentDTO rentDTO);
}
