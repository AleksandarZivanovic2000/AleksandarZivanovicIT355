package controller;

import jakarta.servlet.http.HttpSession;
import model.CartItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CartController {

    @GetMapping("/cart")
    public String viewCart(HttpSession session, Model model){
        List<CartItem> cartItems = (List<CartItem>) session.getAttribute("cartItems");
        model.addAttribute("cartItems", cartItems);
        return "cart";
    }

}
