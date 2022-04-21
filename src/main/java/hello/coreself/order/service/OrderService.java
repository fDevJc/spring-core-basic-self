package hello.coreself.order.service;

import hello.coreself.order.Order;

public interface OrderService {

    Order order(Long id, String itemName, int price);
}
