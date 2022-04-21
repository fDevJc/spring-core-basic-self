package hello.coreself.order.service;

import static org.junit.jupiter.api.Assertions.*;

import hello.coreself.member.Grade;
import hello.coreself.member.Member;
import hello.coreself.member.service.MemberService;
import hello.coreself.member.service.MemberServiceImpl;
import hello.coreself.order.Order;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class OrderServiceTest {
    OrderService orderService = new OrderServiceImpl();
    MemberService memberService = new MemberServiceImpl();
    @Test
    @DisplayName("VIP일때 주문")
    void order_vip() {
        //given
        Member member = new Member(1L, "member", Grade.VIP);

        //when
        memberService.join(member);
        Order order = orderService.order(member.getId(), "itemName", 10000);

        //then
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }

    @Test
    @DisplayName("VIP아닐때 주문")
    void order_basic() {
        //given
        Member member = new Member(1L, "member", Grade.BASIC);

        //when
        memberService.join(member);
        Order order = orderService.order(member.getId(), "itemName", 10000);

        //then
        Assertions.assertThat(order.getDiscountPrice()).isNotEqualTo(1000);
    }

}