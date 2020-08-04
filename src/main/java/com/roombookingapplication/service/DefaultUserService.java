package com.roombookingapplication.service;

import com.roombookingapplication.dto.UsersDto;
import com.roombookingapplication.entity.Users;
import com.roombookingapplication.exception.ValidateException;
import com.roombookingapplication.repository.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

import static java.util.Objects.isNull;

@Service
public class DefaultUserService implements UserService {

    private static final Logger log = Logger.getLogger("DefaultUserService.class");

    private final UsersRepository usersRepository;
    private final UsersConverter usersConverter;

    public DefaultUserService(UsersRepository usersRepository, UsersConverter usersConverter) {
        log.info("SomeMessage");
        this.usersRepository = usersRepository;
        this.usersConverter = usersConverter;
    }


    @Override
    public UsersDto saveUser(UsersDto usersDto) throws ValidateException {

        log.info("saving user: " + usersDto);

        validateUserDto(usersDto);
        log.info("user validates successfully");

        Users savedUser = usersRepository.save(usersConverter.fromUserDtoToUser(usersDto));
        log.info("saved user successfully: " + savedUser);

        return usersConverter.fromUsersToUsersDto(savedUser);
    }

    @Override
    public void deleteUser(Integer userId) {
        log.info("deleted user: " + userId);
        usersRepository.deleteById(userId);
    }

    @Override
    public UsersDto findByLogin(String login) {
        log.info("user is found: " + login);
        return usersConverter.fromUsersToUsersDto(usersRepository.findByLogin(login));
    }

    private void validateUserDto(UsersDto usersDto) throws ValidateException {

        log.info("validate user: " + usersDto);

        if (isNull(usersDto)) {
            log.severe("user dto is null");
            throw new ValidateException("Object user is null");
        }
        if (isNull(usersDto.getLogin()) || usersDto.getLogin().isEmpty()) {
            log.severe("login is empty");
            throw new ValidateException("Login is empty");
        }
    }
}
