package com.product.ProductService.Service;

import com.product.ProductService.Dto.Category;
import com.product.ProductService.Dto.ProductWithCategoryResponse;
import com.product.ProductService.Entity.Product;
import com.product.ProductService.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository _productRepository;

    @Autowired
    private RestTemplate _restTemplate;

    public Product saveProduct(Product product) {
        return _productRepository.save(product);
    }

    public List<Product> findAll() {
        return _productRepository.findAll();
    }

    public ProductWithCategoryResponse getProductWithCategory(long productId) {
        ProductWithCategoryResponse response = new ProductWithCategoryResponse();
        Product product = _productRepository.findByProductId(productId);
        response.setProduct(product);

        Category category = _restTemplate.getForObject("http://CATEGORY-SERVICE/category/" + product.getCategoryId(), Category.class);
        response.setCategory(category);
        return response;
    }
}
