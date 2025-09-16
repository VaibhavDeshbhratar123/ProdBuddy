package com.yourcodebuddy.prodbuddy.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.yourcodebuddy.prodbuddy.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
