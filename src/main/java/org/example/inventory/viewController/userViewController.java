package org.example.inventory.viewController;

import org.example.inventory.entities.Inventory;
import org.example.inventory.services.InventoryService;
import org.example.inventory.services.ProductService;
import org.example.inventory.services.PurchaseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class userViewController {

    @Autowired
    private InventoryService inventoryService;

    @Autowired
    private ProductService productService;

    @Autowired
    private PurchaseOrderService purchaseOrderService;

    /**
     * Display the product ordering page where users can add products to cart
     */
    @GetMapping("/order")
    public String showOrderProductsPage(Model model) {
        // Get all inventory items with products that are available
        List<Inventory> inventories = inventoryService.getAllInventories();
        model.addAttribute("inventories", inventories);

        return "user/orderProducts";
    }

    /**
     * Display user's previous orders
     */
    @GetMapping("/previous-orders")
    public String showPreviousOrdersPage(Model model) {
        // Get the current user's previous orders
        // Note: In a real application, you would get the authenticated user's ID
        // For now, we'll pass an empty list
        model.addAttribute("orders", purchaseOrderService.getAllPurchaseOrders());

        return "user/previousOrders";
    }
}
