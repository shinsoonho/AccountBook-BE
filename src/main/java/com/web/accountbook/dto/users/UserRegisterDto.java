package com.web.accountbook.dto.users;

import com.web.accountbook.entity.Users;
import lombok.Data;

@Data
public class UserRegisterDto {

    private String serviceId;
    private String userPw;
    private String userName;
    private String userPhone;
    private Integer userAge;
    private String userEmail;

    public Users convertEntity() {
        return Users.builder()
                .serviceId(serviceId)
                .userPw(userPw)
                .userName(userName)
                .userPhone(userPhone)
                .userAge(userAge)
                .userEmail(userEmail)
                .build();
    }

}
