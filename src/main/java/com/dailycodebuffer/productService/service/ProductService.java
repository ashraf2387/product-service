package com.dailycodebuffer.productService.service;

import com.dailycodebuffer.productService.model.ProductRequest;
import com.dailycodebuffer.productService.model.ProductResponse;

import java.util.List;

public interface ProductService {
    long addProduct(ProductRequest productRequest);

    ProductResponse getProductById(long productId);

    void reduceQuantity(long productId, long quantity);

    List<ProductResponse> getAllProduct();
}
