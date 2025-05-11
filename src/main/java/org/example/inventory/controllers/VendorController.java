package org.example.inventory.controllers;

import org.example.inventory.entities.Vendor;
import org.example.inventory.services.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/vendors")
public class VendorController {

    @Autowired
    private VendorService vendorService;

    @GetMapping
    public List<Vendor> getVendors() {
        return vendorService.getAllVendors();
    }

    @PostMapping
    public Vendor createVendor(@RequestBody Vendor vendor) {
        return vendorService.createVendor(vendor);
    }

    @PutMapping
    public Vendor updateVendor(@RequestBody Vendor vendor) {
        return vendorService.updateVendor(vendor);
    }

    @DeleteMapping
    public void deleteVendor(@RequestBody Long vendorId) {
        vendorService.DeleteVendor(vendorId);
    }

}
