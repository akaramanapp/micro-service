package com.category.Category.Service;

import com.category.Category.Entity.Category;
import com.category.Category.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository _categoryRepository;

    public Category saveCategory(Category category) {
        return _categoryRepository.save(category);
    }

    public Category findByCategory(Long categoryId) {
        return _categoryRepository.findByCategoryId(categoryId);
    }
}
