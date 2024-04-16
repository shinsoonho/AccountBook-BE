package com.web.accountbook.service;

import com.web.accountbook.common.code.CommonResult;
import com.web.accountbook.dto.users.UserLoginDto;
import com.web.accountbook.dto.users.UserRegisterDto;
import com.web.accountbook.entity.Users;
import com.web.accountbook.exception.ApiException;
import com.web.accountbook.repository.users.UsersRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    private final UsersRepository userRepository;


    /**
     * @apiNote 로그인 Service
     * */
    public void login(UserLoginDto dto) {

        userRepository.findByServiceIdAndUserPw(dto.getServiceId(), dto.getUserPw())
                .orElseThrow(() -> new ApiException(CommonResult.E0002));

    }

    /**
     * @apiNote 회원가입 Service
     * */
    @Transactional
    public void register(UserRegisterDto dto) {

        duplicateCheck(dto.getServiceId()); // 중복검사 후 저장

        Users user = dto.convertEntity();
        userRepository.save(user);
    }

    /**
     * @apiNote 중복체크 Service
     * @param serviceId
     * */
    public void duplicateCheck(String serviceId) {

        userRepository.findByServiceId(serviceId).ifPresent(m->{
            throw new ApiException(CommonResult.E0001);
        });

    }

}
