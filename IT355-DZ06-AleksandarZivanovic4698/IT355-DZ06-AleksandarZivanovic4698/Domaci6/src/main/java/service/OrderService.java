package service;

import model.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    private List<Order> orders;

    public OrderService(){
        this.orders = new ArrayList<>();
    }

    public void createOrder(Order order){
        Long orderId = generateOrderId();

        order.setId(orderId);

        orders.add(order);
    }

    private Long generateOrderId() {
        return System.currentTimeMillis();
    }
}
