package com.web.accountbook.contorller;

import com.web.accountbook.dto.ApiResponse;
import com.web.accountbook.dto.users.UserRegisterDto;
import com.web.accountbook.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public ApiResponse userRegister(@RequestBody UserRegisterDto request) {
      log.info("진입");

      log.info("UserRegisterDto = {}", request);
      userService.register(request);

      return ApiResponse.OK;
    }

    /*
    @PostMapping("/register")
    public ApiResponse userRegister(@RequestBody userRegisterRequest request) {
        userService.register(request.toRegisterDto());
        return ApiResponse.OK;
    }
     */

    /*@PostMapping("/register")
    public ApiResponse register(@RequestBody @Valid AdminRegisterRequest request) {
        adminService.register(request.toRegisterDto());
        return ApiResponse.OK;
    }*/


    /*@GetMapping
    public List<Users> getAllPersons() {
        return personRepository.findAll();
    }

    @GetMapping("/{id}")
    public Users getPersonById(@PathVariable String id) {
        return personRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Users createPerson(@RequestBody Users person) {
        return personRepository.save(person);
    }

    /*
    @PutMapping("/{id}")
    public Users updatePerson(@PathVariable Long id, @RequestBody Users updatedPerson) {
        Users existingPerson = personRepository.findById(id).orElse(null);
        if (existingPerson != null) {
            existingPerson.setName(updatedPerson.getName());
            existingPerson.setAge(updatedPerson.getAge());
            return personRepository.save(existingPerson);
        }
        return null;
    }


    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable String id) {
        personRepository.deleteById(id);
    }*/
}
