package com.yourcodebuddy.prodbuddy.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.yourcodebuddy.prodbuddy.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
