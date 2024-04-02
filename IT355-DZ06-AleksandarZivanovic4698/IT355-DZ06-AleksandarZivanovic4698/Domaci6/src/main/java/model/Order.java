package model;

import java.util.List;

public class Order {

    private Long id;
    private String name;
    private String address;
    private List<CartItem> cartItems;

    public Order(String name, String address, List<CartItem> cartItems) {
        this.name = name;
        this.address = address;
        this.cartItems = cartItems;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }
}
