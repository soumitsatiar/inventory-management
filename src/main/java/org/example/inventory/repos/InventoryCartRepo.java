package org.example.inventory.repos;

import org.example.inventory.entities.InventoryCart;
import org.example.inventory.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryCartRepo extends JpaRepository<InventoryCart, Long> {

    InventoryCart findByProductId(Product productId);

}
