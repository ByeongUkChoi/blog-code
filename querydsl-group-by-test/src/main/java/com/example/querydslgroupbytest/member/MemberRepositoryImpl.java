package com.example.querydslgroupbytest.member;

import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.example.querydslgroupbytest.member.QMember.member;

@Repository
public class MemberRepositoryImpl implements MemberRepository {
    private final JPAQueryFactory jpaQueryFactory;

    public MemberRepositoryImpl(JPAQueryFactory jpaQueryFactory) {
        this.jpaQueryFactory = jpaQueryFactory;
    }

    @Override
    public List<MemberDto> findAll() {
        List<MemberDto> memberDtos = jpaQueryFactory.query()
                .select(Projections.fields(MemberDto.class,
                        member.age,
                        member.name))
                .from(member)
                .groupBy(member.age, member.name)
                .fetch();

        long l = jpaQueryFactory.query()
                .select(Projections.fields(MemberDto.class,
                        member.age,
                        member.name))
                .from(member)
                .groupBy(member.age, member.name)
                .fetchCount();

        return memberDtos;
    }
}
