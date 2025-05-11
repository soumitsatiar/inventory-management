package org.example.inventory.services;

import org.example.inventory.entities.Vendor;
import org.example.inventory.repos.VendorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class VendorService {

    @Autowired
    private VendorRepo vendorRepo;

    public Vendor createVendor(Vendor vendor) {
        return vendorRepo.save(vendor);
    }

    public List<Vendor> getAllVendors() {
        return vendorRepo.findAll();
    }

    public Vendor updateVendor(Vendor vendor) {
        return vendorRepo.save(vendor);
    }

    public void DeleteVendor(Long id) {
        vendorRepo.deleteById(id);
    }
}
