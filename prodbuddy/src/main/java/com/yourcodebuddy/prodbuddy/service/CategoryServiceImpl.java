package com.yourcodebuddy.prodbuddy.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.yourcodebuddy.prodbuddy.entity.Category;
import com.yourcodebuddy.prodbuddy.repository.CategoryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found with id: " + id));
    }

    @Override
    public Category updateCategory(Category category) {
        if (!categoryRepository.existsById(category.getId())) {
            throw new RuntimeException("Category not found with id: " + category.getId());
        }
        return categoryRepository.save(category);
    }

    @Override
    public String deleteCategory(Long id) {
        if(categoryRepository.existsById(id)) {
            categoryRepository.deleteById(id);
            return "Category deleted successfully with id: " + id;
        } else {
            return "Category not found with id: " + id;
        }
    }
}
