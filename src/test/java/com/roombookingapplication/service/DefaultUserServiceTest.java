package com.roombookingapplication.service;


import com.roombookingapplication.entity.Users;
import com.roombookingapplication.repository.UsersRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

class DefaultUserServiceTest {
    private UserService userService;
    private UsersRepository usersRepository;
    private UsersConverter usersConverter;
    private Users users;

    @BeforeEach
    void setUp() {
        usersRepository = mock(UsersRepository.class);
        usersConverter = new UsersConverter();
        users = new Users();
        //when(usersRepository.save(any())).thenReturn()
        userService = new DefaultUserService(usersRepository, usersConverter);
    }

    @Test
    void saveUserReturnUserDto() {

    }
}