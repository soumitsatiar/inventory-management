package org.example.inventory.controllers;

import org.example.inventory.entities.*;
import org.example.inventory.repos.DetailsRepo;
import org.example.inventory.repos.SalesOrderRepo;
import org.example.inventory.request.SalseOrderRequest;
import org.example.inventory.services.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/api")
public class UserController {

    @Autowired
    private InventoryService inventoryService;

    @Autowired
    private SalesOrderRepo salesOrderRepo;

    @Autowired
    private DetailsRepo detailsRepo;

    @GetMapping("/getInventory")
    public List<Inventory> getInventory() {
        return inventoryService.getAllInventories();
    }

    @PostMapping("/addSalesOrder")
    public ResponseEntity<String> addSalesOrder(@RequestBody SalseOrderRequest salseOrderRequest) {

        System.out.println("Details: " + salseOrderRequest);

        List<ItemAndQuantity> cart = salseOrderRequest.getCart();
        Double total = salseOrderRequest.getTotal();
        Details address = salseOrderRequest.getAddress();

        SalesOrder salesOrder = new SalesOrder();

        List<Product> products = new ArrayList<>();

        for (ItemAndQuantity item : cart) {
            Inventory inventory = inventoryService.getInventoryByProductId(item.getId());

            if (inventory == null || inventory.getQuantity() < item.getQuantity()) {
                return ResponseEntity.badRequest().body("Bad Request");
            }
        }

        int x = 0;

        for (ItemAndQuantity item : cart) {
            Inventory inventory = inventoryService.getInventoryByProductId(item.getId());
            inventory.setQuantity(inventory.getQuantity() - item.getQuantity());
            inventoryService.updateInventory(inventory.getProduct(), inventory.getQuantity());
            x += item.getQuantity();

            Product p = inventory.getProduct();
            p.setQuantity(item.getQuantity());
            products.add(p);
        }


        address = detailsRepo.save(address);
        salesOrder.setAddress(address);

        salesOrder.setTotalPrice(total);
        salesOrder.setTotalQuantity(x);

        salesOrderRepo.save(salesOrder);

        return ResponseEntity.ok("Order placed successfully");
    }

}
