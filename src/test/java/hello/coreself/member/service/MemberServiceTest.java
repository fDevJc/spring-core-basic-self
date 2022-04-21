package hello.coreself.member.service;

import static org.junit.jupiter.api.Assertions.*;

import hello.coreself.member.Grade;
import hello.coreself.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void join() {
        //given
        Member member = new Member(1L, "member1", Grade.VIP);

        //when
        memberService.join(member);
        Member foundMember = memberService.findMember(1L);

        //then
        Assertions.assertThat(member.getName()).isEqualTo(foundMember.getName());
    }

}