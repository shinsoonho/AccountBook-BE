package com.web.accountbook.entity;

import jakarta.persistence.*;
import lombok.Getter;
import org.hibernate.annotations.Comment;

@Entity
@Getter
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Comment("계좌 ID")
    @Column(name = "accountId")
    private Long accountId;

    @Comment("사용자 ID")
    @Column(name = "userId")
    private String userId;

    @Comment("은행명")
    @Column(name = "bankName")
    private String backName;

    @Comment("계좌번호")
    @Column(name = "accountNumber")
    private String accountNumber;

    @Comment("현재 잔액")
    @Column(name = "currentBalance")
    private Long currentBalance;



}
