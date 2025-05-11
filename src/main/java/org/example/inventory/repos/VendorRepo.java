package org.example.inventory.repos;

import org.example.inventory.entities.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface VendorRepo extends JpaRepository<Vendor, Long> {
}
