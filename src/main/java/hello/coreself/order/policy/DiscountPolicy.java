package hello.coreself.order.policy;

import hello.coreself.member.Member;

public interface DiscountPolicy {

    int discount(Member member, int price);
}
