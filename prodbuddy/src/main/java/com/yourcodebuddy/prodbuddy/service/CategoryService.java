package com.yourcodebuddy.prodbuddy.service;

import java.util.List;

import com.yourcodebuddy.prodbuddy.entity.Category;

public interface CategoryService {
    Category createCategory(Category category);
    List<Category> getAllCategories();
    Category getCategoryById(Long id);
    Category updateCategory(Category category);
    String deleteCategory(Long id);
}
