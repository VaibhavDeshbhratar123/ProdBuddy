package com.yourcodebuddy.prodbuddy.service;


import java.util.List;

import com.yourcodebuddy.prodbuddy.entity.Product;

public interface ProductService {
    Product createProduct(Product product);
    List<Product> getAllProducts();
    Product getProductById(Long id);
    Product updateProduct(Product product);
    String deleteProduct(Long id);
}
