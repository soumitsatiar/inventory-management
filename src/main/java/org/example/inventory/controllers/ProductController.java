package org.example.inventory.controllers;

import org.example.inventory.dtos.ProductDTO;
import org.example.inventory.entities.Product;
import org.example.inventory.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getProducts() {
        return productService.getAllProducts();
    }

    @PostMapping
    public Product createProduct(@RequestBody ProductDTO product) {
        return productService.createProduct(product);
    }

    @PutMapping(value = "/{id}")
    public Product updateProduct(@RequestBody ProductDTO product, @PathVariable Long id) {
        return productService.updateProduct(id, product);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }
}