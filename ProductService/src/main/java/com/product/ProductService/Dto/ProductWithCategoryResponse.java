package com.product.ProductService.Dto;

import com.product.ProductService.Entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductWithCategoryResponse {
    private Product product;
    private Category category;
}
