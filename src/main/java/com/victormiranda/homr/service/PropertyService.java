package com.victormiranda.homr.service;

import com.victormiranda.homr.dto.proper.RentDTO;

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
