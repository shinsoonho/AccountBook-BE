package com.web.accountbook.entity;

import jakarta.persistence.*;
import lombok.Getter;
import org.hibernate.annotations.Comment;

@Entity
@Getter
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Comment("카테고리 ID")
    @Column(name = "categoryId")
    private Long categoryId;

    @Comment("카테고리 이름")
    @Column(name = "categoryName")
    private String categoryName;

}
