package hello.coreself.order;

import hello.coreself.AppConfig;
import hello.coreself.member.Grade;
import hello.coreself.member.Member;
import hello.coreself.member.service.MemberService;
import hello.coreself.order.service.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderApp {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        OrderService orderService = ac.getBean("orderService", OrderService.class);
        MemberService memberService = ac.getBean("memberService", MemberService.class);

        Member member = new Member(1L, "member1", Grade.VIP);
        memberService.join(member);
        Order orderItem = orderService.order(member.getId(), "item1", 20000);

        System.out.println("orderItem.getDiscountPrice() = " + orderItem.getDiscountPrice());

    }

}
