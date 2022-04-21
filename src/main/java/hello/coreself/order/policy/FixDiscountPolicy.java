package hello.coreself.order.policy;

import hello.coreself.member.Grade;
import hello.coreself.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{
    private final int discountPrice = 1000;
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return discountPrice;
        }
        return 0;
    }
}
