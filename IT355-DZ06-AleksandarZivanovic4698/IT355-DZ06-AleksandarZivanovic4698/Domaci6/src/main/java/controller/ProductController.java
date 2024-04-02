package controller;

import jakarta.servlet.http.HttpSession;
import model.CartItem;
import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import service.ProductService;

import java.util.ArrayList;
import java.util.List;
@Controller
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/")
    public String viewProducts(Model model){
        List<Product> products = productService.getAllProduct();
        model.addAttribute("products", products);
        return "products";
    }

    @PostMapping("/cart/add/{productId}")
    public String addToCart(@PathVariable Long productId, HttpSession session){
        Product product = productService.getProductById(productId);
        if(product != null){
            CartItem cartItem = new CartItem(product.getId(), product.getName(), product.getPrice());
            List<CartItem> cartItems = (List<CartItem>) session.getAttribute("cartItems");
            if(cartItems == null) {
                cartItems = new ArrayList<>();
            }

            cartItems.add(cartItem);
            session.setAttribute("cartItems", cartItems);
        }
        return "redirect:/cart";
    }
}
