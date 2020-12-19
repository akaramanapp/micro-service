package com.product.ProductService.Service;

import com.product.ProductService.Entity.Product;
import com.product.ProductService.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository _productRepository;

    public Product saveProduct(Product product) {
        return _productRepository.save(product);
    }
}
