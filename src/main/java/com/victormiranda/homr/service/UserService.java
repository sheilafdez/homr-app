package com.victormiranda.homr.service;

import com.victormiranda.homr.dto.UserDTO;

/**
 * Created by sheila on 05/07/15.
 */
public interface UserService {

    /**
     * Create new user
     * @param userDTO
     */
    void createUser(final UserDTO userDTO);
}
