package org.example.inventory.services;

import org.example.inventory.entities.InventoryCart;
import org.example.inventory.entities.Product;
import org.example.inventory.repos.InventoryCartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryCartService {

    @Autowired
    private InventoryCartRepo inventoryCartRepo;

    @Autowired
    private ProductService productService;

    @Autowired
    private PurchaseOrderService purchaseOrderService;

    public InventoryCart addToCart(Long productId, int quantity) {
        // Check if the product exists
        Product p = productService.getProductById(productId);

        if (p == null) {
            throw new IllegalArgumentException("Product not found");
        }

        InventoryCart existingCart = inventoryCartRepo.findByProductId(p);

        int existingQty = 0;

        if (existingCart != null) {
            existingQty = existingCart.getQuantity();
        }

        // Create a new InventoryCart object
        InventoryCart cart = new InventoryCart();
        cart.setId(existingCart != null ? existingCart.getId() : null);
        cart.setProductId(p);
        cart.setQuantity(quantity + existingQty);

        // Save the cart to the database
        return inventoryCartRepo.save(cart);
    }

    public List<InventoryCart> getAllItems() {
        return inventoryCartRepo.findAll();
    }

    public void deleteCart() {
        inventoryCartRepo.deleteAll();
    }
}
