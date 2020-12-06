package com.category.Category.Controller;
import com.category.Category.Entity.Category;
import com.category.Category.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CategoryController {

    @Autowired
    private CategoryService _categoryService;

    @GetMapping("")
    public String getCategory() {
        return "Category List";
    }

    @PostMapping("/")
    public Category saveCategory(@RequestBody Category category) {
        return _categoryService.saveCategory(category);
    }
}
