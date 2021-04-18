package com.product.ProductService.Controller;

import com.product.ProductService.Dto.ProductWithCategoryResponse;
import com.product.ProductService.Entity.Product;
import com.product.ProductService.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService _productService;

    @Value("${core.url}")
    private String coreurl;

    @PostMapping("/")
    public Product saveProduct(@RequestBody Product product) {
        return _productService.saveProduct(product);
    }

    @GetMapping("/")
    public List<Product> findAll() {
        return _productService.findAll();
    }

    @GetMapping("/{id}")
    public ProductWithCategoryResponse getProductWithCategory(@PathVariable("id") Long productId) {
        return _productService.getProductWithCategory(productId);
    }
}
