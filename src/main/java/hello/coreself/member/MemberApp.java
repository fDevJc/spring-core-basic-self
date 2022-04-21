package hello.coreself.member;

import hello.coreself.AppConfig;
import hello.coreself.member.service.MemberService;
import hello.coreself.member.service.MemberServiceImpl;

public class MemberApp {

    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        
        Long memberId = 1L;
        Member member = new Member(memberId, "name", Grade.VIP);
        
        memberService.join(member);

        Member foundMember = memberService.findMember(memberId);

        System.out.println("foundMember.getName() = " + foundMember.getName());
    }
}
