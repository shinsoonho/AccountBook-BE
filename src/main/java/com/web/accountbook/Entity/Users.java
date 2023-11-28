package com.web.accountbook.Entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.Getter;
import org.hibernate.annotations.Comment;

import java.time.LocalDateTime;

@Entity
@Table(name = "user_infomation")
@Getter
public class Users {

    @Id
    @Comment("사용자 ID")
    @Column(name = "userId")
    private String userId;

    @Comment("사용자 비밀번호")
    @Column(name = "userPw")
    private String userPw;

    @Comment("사용자 이름")
    @Column(name = "userName")
    private String userName;

    @Comment("사용자 나이")
    @Column(name = "userAge")
    private int userAge;

    @Comment("사용자 이메일")
    @Column(name = "userEmail")
    private String userEmail;

    @Comment("사용자 등록일자")
    @Column(name = "RegDt")
    private LocalDateTime regDt;

    @Comment("사용자 수정일자")
    @Column(name = "UpdDt")
    private LocalDateTime updDt;

}
