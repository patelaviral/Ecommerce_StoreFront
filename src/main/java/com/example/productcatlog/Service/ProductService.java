package com.example.productcatlog.Service;

import com.example.productcatlog.Module.Product;
import com.example.productcatlog.Repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    final private ProductRepository productRepository;
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> getProductsByCategory(Long id){
        return productRepository.findByCategoryId(id);
    }
}
