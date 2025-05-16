package org.example.inventory.controllers;

import org.example.inventory.entities.Inventory;
import org.example.inventory.repos.InventoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/inventory")
public class InventoryController {

    @Autowired
    private InventoryRepo inventoryRepo;

    @GetMapping("/getAll")
    public List<Inventory> getAllInventories() {
        return inventoryRepo.findAll();
    }

}
