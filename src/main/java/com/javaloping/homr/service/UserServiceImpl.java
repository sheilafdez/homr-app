package com.javaloping.homr.service;

import com.javaloping.homr.dto.user.UserDTO;
import com.javaloping.homr.model.User;
import com.javaloping.homr.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

/**
 * @author sheilafdez@gmail.com
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
