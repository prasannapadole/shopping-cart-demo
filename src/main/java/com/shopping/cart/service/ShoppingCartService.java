package com.shopping.cart.service;

import com.shopping.cart.domain.Product;
import com.shopping.cart.domain.Cart;
import com.shopping.cart.dto.ShoppingCartDTO;
import com.shopping.cart.repository.ProductRepository;
import com.shopping.cart.repository.ShoppingCartRepository;
import com.shopping.cart.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by sahan on 4/9/2016.
 */
@Service
@Transactional
public class ShoppingCartService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ShoppingCartRepository shoppingCartRepository;

    public Cart saveProducts(ShoppingCartDTO shoppingCartDTO) {
        Cart shoppingCart = new Cart();
        Product product = productRepository.findOne(shoppingCartDTO.getProductId());
        shoppingCart.setProduct(product);
        shoppingCart.setUser(userRepository.findOne(1L));
        shoppingCart.setStatus(shoppingCartDTO.getStatus());
        shoppingCart.setDate(new Date());
        shoppingCart.setStock(shoppingCartDTO.getStock());
        shoppingCart.setAmount(product.getPrice() * shoppingCartDTO.getStock());

        return shoppingCartRepository.save(shoppingCart);
    }


    public List<Cart> findAll() {
//        return shoppingCartRepository.findAll();
        return shoppingCartRepository.findByStatus("NOT_PURCHASED");
    }

    public Cart updateProduct(ShoppingCartDTO shoppingCartDTO, Long id) {
        Cart updateItem = shoppingCartRepository.findOne(id);
        updateItem.setStock(shoppingCartDTO.getStock());
        updateItem.setAmount(updateItem.getProduct().getPrice() * shoppingCartDTO.getStock());
        return shoppingCartRepository.save(updateItem);
    }

    public void deleteProduct(Long id) {
        shoppingCartRepository.delete(id);
    }

    public void clearShoppingCart(Object object) {
        shoppingCartRepository.delete(findAll());
    }


    public List<Cart> findByPurchased() {
        return shoppingCartRepository.findByStatus("PURCHASED");
    }


    public void purchaseProducts(Long id) {
        Cart shoppingCart = shoppingCartRepository.findOne(id);
        shoppingCart.setStatus("PURCHASED");
        shoppingCartRepository.save(shoppingCart);
    }
}
