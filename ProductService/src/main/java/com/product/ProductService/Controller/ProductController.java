package com.product.ProductService.Controller;

import com.product.ProductService.Entity.Product;
import com.product.ProductService.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
