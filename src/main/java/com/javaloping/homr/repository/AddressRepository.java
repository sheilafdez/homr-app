package com.javaloping.homr.repository;

import com.javaloping.homr.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author victormiranda@gmail.com
 */
@Repository
public interface AddressRepository
        extends CrudRepository<Address, Long> {
}
