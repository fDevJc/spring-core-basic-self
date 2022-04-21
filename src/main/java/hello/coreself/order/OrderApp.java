package hello.coreself.order;

import hello.coreself.AppConfig;
import hello.coreself.member.Grade;
import hello.coreself.member.Member;
import hello.coreself.member.service.MemberService;
import hello.coreself.member.service.MemberServiceImpl;
import hello.coreself.order.service.OrderService;
import hello.coreself.order.service.OrderServiceImpl;

public class OrderApp {

    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        OrderService orderService = appConfig.orderService();
        MemberService memberService = appConfig.memberService();

        Member member = new Member(1L, "member1", Grade.VIP);
        memberService.join(member);
        Order orderItem = orderService.order(member.getId(), "item1", 20000);

        System.out.println("orderItem.getDiscountPrice() = " + orderItem.getDiscountPrice());

    }

}
