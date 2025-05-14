package org.example.inventory.controllers;

import org.example.inventory.dtos.InventoryCartDTO;
import org.example.inventory.entities.InventoryCart;
import org.example.inventory.services.InventoryCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/v1/inventoryCart")
public class InventoryCartController {

    @Autowired
    private InventoryCartService inventoryCartService;

    @PostMapping("/add")
    public InventoryCart addToCart(@RequestBody InventoryCartDTO cartDTO) {
        return inventoryCartService.addToCart(cartDTO.getProductId(), cartDTO.getQuantity());
    }

    @GetMapping("/all")
    public Collection<InventoryCart> getAllItems() {
        return inventoryCartService.getAllItems();
    }

    @PostMapping("/delete")
    public void deleteCart() {
        inventoryCartService.deleteCart();
    }
}
