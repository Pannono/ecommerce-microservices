package com.ecommerce_microservices.service_product.service;

import com.ecommerce_microservices.service_product.entity.Product;
import com.ecommerce_microservices.service_product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    // Product repository Dependency Injection
    @Autowired
    private ProductRepository productRepository;

    // Product created and saved into DB
    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    // Get a list of all products from DB
    public List<Product> findAll(){
        return productRepository.findAll();
    }

    // Get a single product by id from DB
    public Optional<Product> findById(Long id){
        return productRepository.findById(id);
    }

    // Update a single product by id
    public Product updateProduct(Long id, Product updatedProduct){
        Optional<Product> existingProduct =  productRepository.findById(id);
        if(existingProduct.isPresent()){
            Product product = existingProduct.get();
            product.setName(updatedProduct.getName());
            product.setPrice(updatedProduct.getPrice());
            product.setDescription(updatedProduct.getDescription());
            product.setQuantity(updatedProduct.getQuantity());
            return productRepository.save(product);
        } else {
            throw new RuntimeException("Product not found");
        }
    }

    // Delete a single product by Id
    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }

}
