package org.example.inventory.viewController;

import org.example.inventory.entities.Inventory;
import org.example.inventory.entities.User;
import org.example.inventory.services.InventoryService;
import org.example.inventory.services.ProductService;
import org.example.inventory.services.PurchaseOrderService;
import org.example.inventory.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @Autowired
    private UserService userService;

    @GetMapping("/order")
    public String showOrderProductsPage(Model model) {
        List<Inventory> inventories = inventoryService.getAllInventories();
        model.addAttribute("inventories", inventories);
        return "user/orderProducts";
    }

    @GetMapping("/previous-orders")
    public String showPreviousOrdersPage(Model model) {
        model.addAttribute("orders", purchaseOrderService.getAllPurchaseOrders());
        return "user/previousOrders";
    }

    @GetMapping("/register")
    public String showRegisterPage() {
        return "user/registerUser";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user) {

        boolean res = userService.checkIfUserExists(user.getEmail());

        if (res) return "redirect:/user/register?exists";

        User newUser = userService.registerUser(user);
        if (newUser == null) return "redirect:/user/register?error";
        return "redirect:/user/register?success";
    }
}
