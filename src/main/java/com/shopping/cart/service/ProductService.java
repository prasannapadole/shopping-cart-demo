package com.shopping.cart.service;

import com.shopping.cart.domain.Product;
import com.shopping.cart.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sahan on 4/8/2016.
 */
@Service
@Transactional
public class ProductService{

    @Autowired
    private ProductRepository productRepository;

    private static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product("Soap",35.75d,1000));
        products.add(new Product("Tooth Brushe",45.50d,500));
        products.add(new Product("Shirt",1500.0d,100));
        products.add(new Product("Office Bag",1000.0d,400));
        products.add(new Product("Bottle",450.0d,800));
        products.add(new Product("Wrist Watch",2500.0d,800));
        products.add(new Product("Mobile Phone",45000.0d,800));
        products.add(new Product("Shampoo",300.0d,800));
        products.add(new Product("Leather Wallets",550.0d,800));
        products.add(new Product("Camera",85000.0d,800));
    }

    public void saveInitialBatch(){
        productRepository.save(products);
    }

    public List<Product> findAll(){
        return productRepository.findAll();
    }


}
