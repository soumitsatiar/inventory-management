package org.example.inventory.controllers;

import org.example.inventory.entities.PurchaseOrder;
import org.example.inventory.services.InventoryCartService;
import org.example.inventory.services.PurchaseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
public class PurchaseOrderController {

    @Autowired
    private InventoryCartService inventoryCartService;

    @Autowired
    private PurchaseOrderService purchaseOrderService;

    @GetMapping("/api/v1/getPurchaseOrders")
    public List<PurchaseOrder> getPurchaseOrders() {
        return purchaseOrderService.getAllPurchaseOrders();
    }

//    @GetMapping("/api/v1/addPurchaseOrder")
//    public PurchaseOrder addPurchaseOrder() {
//        return inventoryCartService.addItemsToInvoice();
//    }

}
