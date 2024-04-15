package com.web.accountbook.service;

import com.web.accountbook.dto.users.UserRegisterDto;
import com.web.accountbook.entity.Users;
import com.web.accountbook.repository.UsersRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    private final UsersRepository userRepository;

    public void register(UserRegisterDto dto) {

        Users user = dto.convertEntity();

        userRepository.save(user);
    }


}
