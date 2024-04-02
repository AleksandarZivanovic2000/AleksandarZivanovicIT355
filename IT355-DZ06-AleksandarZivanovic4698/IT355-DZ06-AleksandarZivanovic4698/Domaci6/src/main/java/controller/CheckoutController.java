package controller;

import jakarta.servlet.http.HttpSession;
import model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.OrderService;
import model.CartItem;

import java.util.List;

@Controller
public class CheckoutController {

    private OrderService orderService;

    @Autowired
    public CheckoutController(OrderService orderService){
        this.orderService = orderService;
    }
    @PostMapping("/checkout")
    public String checkout(@RequestParam String name, @RequestParam String address, HttpSession session, Model model){
        List<CartItem> cartItems = (List<CartItem>) session.getAttribute("cartItems");
        if(cartItems != null && !cartItems.isEmpty()){
            Order order = new Order(name, address, cartItems);

            orderService.createOrder(order);

            double totalPrice = calculateTotalPrice(cartItems);

            session.removeAttribute("totalPrice");
            return "checkout";
        }

        return "redirect:/cart";
    }
    private double calculateTotalPrice(List<CartItem> cartItems) {
        double totalPrice = 0;
        for (CartItem item : cartItems) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
}

