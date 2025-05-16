package org.example.inventory.services;

import org.example.inventory.entities.Inventory;
import org.example.inventory.entities.Product;
import org.example.inventory.repos.InventoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {
    @Autowired
    private InventoryRepo inventoryRepo;

    public List<Inventory> getAllInventories() {
        return inventoryRepo.findAll();
    }

    public Inventory getInventoryByProductId(Long productId) {
        return inventoryRepo.findAll().stream()
            .filter(inv -> inv.getProduct().getId().equals(productId))
            .findFirst()
            .orElse(null);
    }

    public Inventory createInventory(Product p) {
        Inventory inventory = new Inventory();
        inventory.setProduct(p);
        inventory.setQuantity(p.getQuantity());
        return inventoryRepo.save(inventory);
    }

    public Inventory updateInventory(Product p, int quantity) {
        Inventory inventory = inventoryRepo.findAll().stream()
            .filter(inv -> inv.getProduct().getId().equals(p.getId()))
            .findFirst()
            .orElse(null);
        if (inventory != null) {
            inventory.setQuantity(quantity);
            return inventoryRepo.save(inventory);
        }
        return null;
    }
}
