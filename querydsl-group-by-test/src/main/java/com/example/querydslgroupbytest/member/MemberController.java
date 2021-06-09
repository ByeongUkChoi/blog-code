package com.example.querydslgroupbytest.member;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {
    private final MemberRepository memberRepository;

    public MemberController(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @GetMapping("members")
    public List<MemberDto> getMembers() {
        return memberRepository.findAll();
    }
}
