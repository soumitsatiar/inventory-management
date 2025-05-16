package org.example.inventory.controllers;

import org.example.inventory.dtos.InventoryCartDTO;
import org.example.inventory.entities.InventoryCart;
import org.example.inventory.entities.Product;
import org.example.inventory.entities.PurchaseOrder;
import org.example.inventory.services.InventoryCartService;
import org.example.inventory.services.PurchaseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/api/v1/inventoryCart")
public class InventoryCartController {

    @Autowired
    private InventoryCartService inventoryCartService;

    @Autowired
    private PurchaseOrderService purchaseOrderService;

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

    @GetMapping("/addPurchaseOrder")
    public PurchaseOrder addItemsToInvoice() {

        List<InventoryCart> items = inventoryCartService.getAllItems();

        List<Product> products = new ArrayList<>();

        int totalQuantity = 0;
        double totalPrice = 0;

        for (InventoryCart item : items) {
            Product p = item.getProductId();
            p.setQuantity(item.getQuantity());
            products.add(p);
            totalQuantity += item.getQuantity();
            totalPrice += p.getPrice() * item.getQuantity();
        }

        PurchaseOrder order = new PurchaseOrder();

        order.setProducts(products);
        order.setTotalQuantity(totalQuantity);
        order.setTotalPrice(totalPrice);

        inventoryCartService.deleteCart();
        return purchaseOrderService.createPurchaseOrder(order);
    }
}
