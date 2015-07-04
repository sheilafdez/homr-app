package com.victormiranda.homr.repository;

import com.victormiranda.homr.model.Property;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by victor on 04/07/15.
 */
@Repository
public interface PropertyRepository
        extends CrudRepository<Property, Long> {
}
