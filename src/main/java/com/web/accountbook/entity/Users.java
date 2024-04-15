package com.web.accountbook.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Comment;

@Entity
@Table(name = "user_infomation")
@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Users extends CommonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    @SequenceGenerator(name = "user_seq", sequenceName = "USER_SEQ", allocationSize = 1)
    @Comment("사용자 ID")
    @Column(name = "userId")
    private Long userId;

    @Comment("사용자 서비스 ID")
    @Column(name = "serviceId")
    private String serviceId;

    @Comment("사용자 비밀번호")
    @Column(name = "userPw")
    private String userPw;

    @Comment("사용자 이름")
    @Column(name = "userName")
    private String userName;

    @Comment("사용자 나이")
    @Column(name = "userAge")
    private Integer userAge;

    @Comment("사용자 이메일")
    @Column(name = "userEmail")
    private String userEmail;

    @Comment("사용자 전화번호")
    @Column(name = "userPhone")
    private String userPhone;

    @Builder
    public Users(String serviceId, String userPw, String userName, Integer userAge, String userEmail, String userPhone) {
        this.serviceId = serviceId;
        this.userPw = userPw;
        this.userName = userName;
        this.userAge = userAge;
        this.userEmail = userEmail;
        this.userPhone = userPhone;
    }

}
