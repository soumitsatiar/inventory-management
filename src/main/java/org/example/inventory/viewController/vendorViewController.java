package org.example.inventory.viewController;

import org.example.inventory.dtos.ProductDTO;
import org.example.inventory.entities.Product;
import org.example.inventory.entities.Vendor;
import org.example.inventory.services.ProductService;
import org.example.inventory.services.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class vendorViewController {

    @Autowired
    private VendorService vendorService;

    @Autowired
    private ProductService productService;

    @GetMapping("/admin/addNewVendor")
    public String hello(){
        return "addNewVendor";
    }

    @GetMapping("/admin/addProduct")
    public String addProduct(Model model){
        List<Vendor> vendors = vendorService.getAllVendors();
        model.addAttribute("vendors", vendors);
        return "addNewProduct";
    }

    @GetMapping("/admin/viewAllProducts")
    public String viewAllProducts(Model model){
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "viewAllProducts";
    }

    @PostMapping("/admin/addNewVendor")
    public String addNewVendor(@ModelAttribute Vendor vendor){

        RestTemplate restTemplate = new RestTemplate();
        Vendor vendor1 = restTemplate.postForObject("http://localhost:8080/api/v1/vendors", vendor, Vendor.class);

        if (vendor1 == null) {
            return "redirect:/admin/addNewVendor?error";
        }

        return "redirect:/admin/addNewVendor?success";
    }

    @PostMapping("/admin/addProduct")
    public String addNewProduct(@ModelAttribute ProductDTO product){
        RestTemplate restTemplate = new RestTemplate();
        Product product1 = restTemplate.postForObject("http://localhost:8080/api/v1/products", product, Product.class);

        if (product1 == null) {
            return "redirect:/admin/addProduct?error";
        }
        return "redirect:/admin/addProduct?success";
    }

}
