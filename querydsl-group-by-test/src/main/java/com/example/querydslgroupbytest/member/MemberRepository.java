package com.example.querydslgroupbytest.member;

import org.springframework.data.repository.Repository;

import java.util.List;

public interface MemberRepository extends Repository<Member, Long> {
    List<MemberDto> findAll();
}
