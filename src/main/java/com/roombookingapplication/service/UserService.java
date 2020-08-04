package com.roombookingapplication.service;

import com.roombookingapplication.dto.UsersDto;
import com.roombookingapplication.exception.ValidateException;

public interface UserService {
    public UsersDto saveUser(UsersDto usersDTO) throws ValidateException;

    public void deleteUser(Integer userId);

    public UsersDto findByLogin(String login);

}
