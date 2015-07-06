package com.javaloping.homr.repository;

import com.javaloping.homr.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author sheilafdez@gmail.com
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
