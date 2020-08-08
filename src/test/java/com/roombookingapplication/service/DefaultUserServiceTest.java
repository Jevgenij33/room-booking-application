package com.roombookingapplication.service;

import com.roombookingapplication.dto.UsersDto;
import com.roombookingapplication.exception.ValidateException;
import com.roombookingapplication.repository.UsersRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static prototype.UserPrototype.aUser;
import static prototype.UserPrototype.aUserDTO;

class DefaultUserServiceTest {

    private UsersRepository usersRepositoryMock;
    private UsersConverter usersConverter;
    private UserService userService;

    @BeforeEach
    void setUp() {
        usersRepositoryMock = mock(UsersRepository.class);
        usersConverter = new UsersConverter();
        userService = new DefaultUserService(usersRepositoryMock, usersConverter);
    }

    @Test
    void saveUser() throws ValidateException {
        when(usersRepositoryMock.save(any())).thenReturn(aUser());
        UsersDto createdUser = userService.saveUser(aUserDTO());
        assertThat(createdUser).isNotNull();
        assertThat(createdUser.getName()).isEqualTo(aUserDTO().getName());
    }

    @Test
    void deleteUser() {

    }

    @Test
    void findByLogin() {

    }
}