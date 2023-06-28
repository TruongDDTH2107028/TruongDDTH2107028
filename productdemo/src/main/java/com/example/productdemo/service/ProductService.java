package com.example.productdemo.service;

import com.example.productdemo.entity.Product;

import java.util.List;

public interface ProductService {
    public List<Product> findAll();
    public Product findById(int theId);
    public void save(Product theProduct);
    public void deleteById(int theId);
}
