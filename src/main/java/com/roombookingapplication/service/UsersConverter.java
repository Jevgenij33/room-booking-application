package com.roombookingapplication.service;

import com.roombookingapplication.dto.UsersDto;
import com.roombookingapplication.entity.Users;
import org.springframework.stereotype.Component;

@Component
public class UsersConverter {

    public UsersDto fromUsersToUsersDto(Users users) {
        UsersDto u = new UsersDto();
        u.setId(users.getId());
        u.setLogin(users.getLogin());
        u.setName(users.getName());
        u.setSurname(users.getSurname());
        u.setPassword(users.getPassword());
        u.setRole(users.getRole());
        return u;
    }

    public Users fromUserDtoToUser(UsersDto usersDto) {
        Users u = new Users();
        u.setId(usersDto.getId());
        u.setLogin(usersDto.getLogin());
        u.setName(usersDto.getName());
        u.setSurname(usersDto.getSurname());
        u.setPassword(usersDto.getPassword());
        u.setRole(usersDto.getRole());
        return u;
    }
}
