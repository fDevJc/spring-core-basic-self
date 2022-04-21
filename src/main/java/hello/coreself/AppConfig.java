package hello.coreself;

import hello.coreself.member.repository.MemberRepository;
import hello.coreself.member.repository.MemoryMemberRepository;
import hello.coreself.member.service.MemberService;
import hello.coreself.member.service.MemberServiceImpl;
import hello.coreself.order.policy.DiscountPolicy;
import hello.coreself.order.policy.RateDiscountPolicy;
import hello.coreself.order.service.OrderService;
import hello.coreself.order.service.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }


}
