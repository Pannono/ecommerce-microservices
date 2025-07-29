package com.ecommerce_microservices.service_product.controller;

import com.ecommerce_microservices.service_product.entity.Product;
import com.ecommerce_microservices.service_product.repository.ProductRepository;
import com.ecommerce_microservices.service_product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<Product> save(@RequestBody Product product){
        productService.saveProduct(product);
        return ResponseEntity.ok().body(product);
    }

    @GetMapping
    public List<Product> findAllProducts(){
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        Optional<Product> product=productService.findById(id);
        return product.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product product){
        Product updatedProduct=productService.updateProduct(id, product);
        return ResponseEntity.ok().body(updatedProduct);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
        return ResponseEntity.ok().body("Product deleted");
    }

}
