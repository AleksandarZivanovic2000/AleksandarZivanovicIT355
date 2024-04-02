package service;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    private List<Product> products;

    public ProductService(){
        products = new ArrayList<>();

        products.add(new Product(1L, "Koca", 110));
        products.add(new Product(2L, "Fanta", 120));
        products.add(new Product(3L, "Pepsi", 130));
    }

    public List<Product> getAllProduct(){
        return products;
    }

    public Product getProductById(Long productId){
        for(Product product: products){
            if(product.getId().equals(productId)){
                return product;
            }
        }
        return null;
    }
}
