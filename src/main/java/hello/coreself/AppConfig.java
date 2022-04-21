package hello.coreself;

import hello.coreself.member.repository.MemberRepository;
import hello.coreself.member.repository.MemoryMemberRepository;
import hello.coreself.member.service.MemberService;
import hello.coreself.member.service.MemberServiceImpl;
import hello.coreself.order.policy.DiscountPolicy;
import hello.coreself.order.policy.RateDiscountPolicy;
import hello.coreself.order.service.OrderService;
import hello.coreself.order.service.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }


}
