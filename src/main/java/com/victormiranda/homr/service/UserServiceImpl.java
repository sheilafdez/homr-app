package com.victormiranda.homr.service;

import com.victormiranda.homr.dto.UserDTO;
import com.victormiranda.homr.model.User;
import com.victormiranda.homr.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

/**
 * Created by sheila on 05/07/15.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Resource
    private UserRepository userRepository;

    public void createUser(UserDTO userDTO) {
        User user = new User(userDTO.getUsername(), userDTO.getName(), userDTO.getPhoneNumber());
        userRepository.save(user);
    }
}
