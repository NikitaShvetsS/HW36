package org.example;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.entity.Order;
import org.example.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
@Slf4j
public class OrderService {

    private final OrderRepository orderRepository;

    public List<Order> getAllOrders() {
        log.info("Run method get all orders");
        return orderRepository.findAll();
    }

    public Optional<Order> getOrderById(Long id) {
        log.info("Run method get order by id");
        return orderRepository.findById(id);
    }

    public Order addOrder(Order order) {
        log.info("Run method add new order");
        return orderRepository.save(order);
    }

    public void deleteOrder(Long id) {
        log.info("Run method delete order by id");
        orderRepository.deleteById(id);
    }

}
