package hello.coreself.member.service;


import hello.coreself.AppConfig;
import hello.coreself.member.Grade;
import hello.coreself.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MemberServiceTest {

    AppConfig appConfig = new AppConfig();

    MemberService memberService;

    @BeforeEach
    void beforeEach() {
        memberService = appConfig.memberService();
    }

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