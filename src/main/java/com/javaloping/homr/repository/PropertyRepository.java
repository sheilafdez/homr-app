package com.javaloping.homr.repository;

import com.javaloping.homr.model.Property;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author victormiranda@gmail.com
 */
@Repository
public interface PropertyRepository
        extends CrudRepository<Property, Long> {
}
