package com.shopping.cart.controller;

import com.shopping.cart.manager.ProductManager;
import com.shopping.cart.model.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductManager productService;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<Product> getAll(){
        return productService.findAll();
    }
}
