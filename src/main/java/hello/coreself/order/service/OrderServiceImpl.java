package hello.coreself.order.service;

import hello.coreself.member.Member;
import hello.coreself.member.repository.MemberRepository;
import hello.coreself.member.repository.MemoryMemberRepository;
import hello.coreself.order.Order;
import hello.coreself.order.policy.DiscountPolicy;
import hello.coreself.order.policy.FixDiscountPolicy;
import hello.coreself.order.policy.RateDiscountPolicy;

public class OrderServiceImpl implements OrderService{

    private MemberRepository memberRepository = new MemoryMemberRepository();
    private DiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Override
    public Order order(Long id, String itemName, int price) {
        Member member = memberRepository.findById(id);
        int discountPrice = discountPolicy.discount(member, price);

        Order order = new Order(1L, itemName, price, discountPrice);

        return order;
    }
}
