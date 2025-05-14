package org.example.inventory.services;

import org.example.inventory.dtos.ProductDTO;
import org.example.inventory.entities.Product;
import org.example.inventory.entities.Vendor;
import org.example.inventory.repos.ProductRepo;
import org.example.inventory.repos.VendorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private VendorRepo vendorRepo;

    public Product createProduct(ProductDTO product) {
        Vendor vendor = vendorRepo.findById(product.getVendorId()).get();
        Product newProduct = new Product();
        newProduct.setName(product.getName());
        newProduct.setDescription(product.getDescription());
        newProduct.setPrice(product.getPrice());
        newProduct.setVendor(vendor);
        return productRepo.save(newProduct);
    }

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public Product getProductById(Long id) {
        return productRepo.findById(id).orElse(null);
    }

    public void deleteProduct(Long id) {
        productRepo.deleteById(id);
    }

    public Product updateProduct(Long id, ProductDTO product) {
        Product productToUpdate = productRepo.findById(id).get();
        Vendor vendor = vendorRepo.findById(product.getVendorId()).get();
        Product newProduct = new Product();
        newProduct.setId(id);
        newProduct.setName(product.getName());
        newProduct.setDescription(product.getDescription());
        newProduct.setPrice(product.getPrice());
        newProduct.setVendor(vendor);
        return productRepo.save(newProduct);
    }
}
