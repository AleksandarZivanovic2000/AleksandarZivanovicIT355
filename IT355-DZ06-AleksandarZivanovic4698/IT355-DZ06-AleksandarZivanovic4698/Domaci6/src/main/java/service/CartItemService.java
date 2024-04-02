package service;

import model.CartItem;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartItemService {

    private List<CartItem> cartItems;

    public CartItemService() {
        this.cartItems = new ArrayList<>();
    }

    public void addToCart(CartItem cartItem) {
        cartItems.add(cartItem);
    }

    public void removeFromCart(CartItem cartItem) {
        cartItems.remove(cartItem);
    }

    public List<CartItem> getAllCartItems() {
        return cartItems;
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (CartItem cartItem : cartItems) {
            totalPrice += cartItem.getPrice();
        }
        return totalPrice;
    }

    public void clearCart() {
        cartItems.clear();
    }

    public void updateCartItem(CartItem cartItem) {
        // Provera da li se stavka već nalazi u korpi
        boolean found = false;
        for (CartItem item : cartItems) {
            if (item.getId().equals(cartItem.getId())) {
                found = true;
                break;
            }
        }

        // Ažuriranje ili dodavanje stavke u korpu
        if (found) {
            removeFromCart(cartItem);
        }
        addToCart(cartItem);
    }
}
