package com.web.accountbook.entity;

import jakarta.persistence.*;
import lombok.Getter;
import org.hibernate.annotations.Comment;

@Entity
@Getter
@Table(name = "Debt")
public class Debt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Comment("빚 ID")
    @Column(name = "debtId")
    private Long debtId;


    @Comment("사용자 ID")
    @Column(name = "userId")
    private String userId;

    @Comment("빚 종류")
    @Column(name = "debtType")
    private String debtType;

    @Comment("금액")
    @Column(name = "amount")
    private Long amount;

    @Comment("이자율")
    @Column(name = "interestRate")
    private Double interestRate;

    @Comment("메모")
    @Column(name = "memo")
    private String memo;



}
