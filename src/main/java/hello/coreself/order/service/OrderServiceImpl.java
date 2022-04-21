package hello.coreself.order.service;

import hello.coreself.member.Member;
import hello.coreself.member.repository.MemberRepository;
import hello.coreself.order.Order;
import hello.coreself.order.policy.DiscountPolicy;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order order(Long id, String itemName, int price) {
        Member member = memberRepository.findById(id);
        int discountPrice = discountPolicy.discount(member, price);

        Order order = new Order(1L, itemName, price, discountPrice);

        return order;
    }
}
