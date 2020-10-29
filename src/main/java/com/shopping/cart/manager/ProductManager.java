package com.shopping.cart.manager;

import com.shopping.cart.model.Product;
import com.shopping.cart.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ProductManager{

    @Autowired
    private ProductRepository productRepository;

    private static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product("Puma Shoes",5400.89d,2));
        products.add(new Product("Apple Watch",45000.50d,1));
        products.add(new Product("Raymond Shirt",1500.0d,5));
        products.add(new Product("Mobile",12000.0d,4));
        products.add(new Product("Camera",8000.0d,1));
        products.add(new Product("Wrist Watch",2500.0d,8));
        products.add(new Product("Blazzor",4500.0d,8));
        products.add(new Product("Cap",300.0d,8));
        products.add(new Product("Wallets",550.0d,80));
        products.add(new Product("Bottle",85.0d,800));
    }

    public void saveInitialBatch(){
        productRepository.save(products);
    }

    public List<Product> findAll(){
        return productRepository.findAll();
    }


}
