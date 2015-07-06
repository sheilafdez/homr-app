package com.javaloping.homr.dto.user;

import com.javaloping.homr.model.User;

/**
 * @author victormiranda@gmail.com
 */
public class UserDTOFactory {

    public static UserDTO create(final User model) {
        final UserDTO user = new UserDTO();

        user.setId(model.getId());
        user.setName(model.getPhoneNumber());
        user.setUsername(model.getUsername());

        return user;
    }
}
