package hello.coreself.member;

import hello.coreself.AppConfig;
import hello.coreself.member.service.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = ac.getBean("memberService", MemberService.class);
        
        Long memberId = 1L;
        Member member = new Member(memberId, "name", Grade.VIP);
        
        memberService.join(member);

        Member foundMember = memberService.findMember(memberId);

        System.out.println("foundMember.getName() = " + foundMember.getName());
    }
}
