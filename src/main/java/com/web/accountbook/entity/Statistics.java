package com.web.accountbook.entity;

import jakarta.persistence.*;
import lombok.Getter;
import org.hibernate.annotations.Comment;

@Entity
@Getter
@Table(name = "statistics")
public class Statistics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Comment("통계 ID")
    @Column(name = "statisticsId")
    private Long statisticsId;

    @Comment("사용자 ID")
    @Column(name = "userId")
    private String userId;

    @Comment("지출 합계")
    @Column(name = "totalExpenses")
    private Long totalExpenses;

    @Comment("수입 합계")
    @Column(name = "totalIncome")
    private Long totalIncome;

    @Comment("월")
    @Column(name = "month")
    private Integer month;

    @Comment("년도")
    @Column(name = "year")
    private Integer year;


}
