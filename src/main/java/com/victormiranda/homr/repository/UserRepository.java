package com.victormiranda.homr.repository;

import com.victormiranda.homr.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sheila on 05/07/15.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
