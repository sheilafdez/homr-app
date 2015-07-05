package com.javaloping.homr.dto.user;

import com.javaloping.homr.model.User;

/**
 * @author victormiranda@gmail.com
 */
public class UserDTOFactory {

    public static UserDTO create(final User model) {
        UserDTO user = new UserDTO();

        return user;
    }
}
