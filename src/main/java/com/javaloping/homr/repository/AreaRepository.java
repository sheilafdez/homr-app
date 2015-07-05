package com.javaloping.homr.repository;

import com.javaloping.homr.model.Area;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author victormiranda@gmail.com
 */
@Repository
public interface AreaRepository
        extends CrudRepository<Area, Long> {

}
