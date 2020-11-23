package com.byeongukchoi.springdatarestexample.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.ZonedDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Post {
    @Id
    @GeneratedValue
    private Long id;

    private String subject;

    private String content;

    @CreationTimestamp
    private ZonedDateTime createdDateTime;

    @UpdateTimestamp
    private ZonedDateTime updatedDateTime;
}
