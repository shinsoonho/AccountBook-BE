package com.web.accountbook.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@NoArgsConstructor
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class CommonEntity {

    @CreatedDate
    @Comment("사용자 등록일자")
    @Column(name = "RegDt")
    private LocalDateTime regDt;

    @LastModifiedDate
    @Comment("사용자 수정일자")
    @Column(name = "UpdDt")
    private LocalDateTime updDt;

}
