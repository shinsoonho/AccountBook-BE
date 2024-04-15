package com.web.accountbook.entity;

import jakarta.persistence.*;
import lombok.Getter;
import org.hibernate.annotations.Comment;

@Entity
@Getter
@Table(name = "transaction")
public class Transaction extends CommonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Comment("거래 ID")
    @Column(name = "transactionId")
    private Long transactionId;

    @Comment("사용자 ID")
    @Column(name = "userId")
    private String userId;

    @Comment("카테고리 ID")
    @Column(name = "categoryId")
    private String categoryId;

    @Comment("금액")
    @Column(name = "amount")
    private Integer amount;

    @Comment("메모")
    @Column(name = "memo")
    private String memo;


}
