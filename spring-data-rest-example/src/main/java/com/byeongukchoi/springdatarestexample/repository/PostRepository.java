package com.byeongukchoi.springdatarestexample.repository;

import com.byeongukchoi.springdatarestexample.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
