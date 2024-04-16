package com.web.accountbook.contorller;

import com.web.accountbook.dto.ApiResponse;
import com.web.accountbook.dto.users.UserLoginDto;
import com.web.accountbook.dto.users.UserRegisterDto;
import com.web.accountbook.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @PostMapping("/login")

    public ApiResponse userLogin(@RequestBody UserLoginDto request) {

        log.info("UserLoginDto = {}", request);
        userService.login(request);

        return ApiResponse.OK;
    }

    @PostMapping("/register")
    public ApiResponse userRegister(@RequestBody UserRegisterDto request) {

      log.info("UserRegisterDto = {}", request);
      userService.register(request);

      return ApiResponse.OK;
    }

    @PostMapping("/duplicateCheck")
    public ApiResponse userDuplicateCheck(@RequestBody Map<String, Object> request) {

        String serviceId = (String) request.get("serviceId");
        log.info("serviceId = {}", serviceId);

        userService.duplicateCheck(serviceId);

        return ApiResponse.OK;
    }

}
