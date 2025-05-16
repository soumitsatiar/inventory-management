package org.example.inventory.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "inventories")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Inventory {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @OneToOne
    @JoinColumn(name = "product_id", unique = true)
    private Product product;

    private Integer quantity;
    
    // Convenience method to check if product is in stock
    public boolean isInStock() {
        return quantity > 0;
    }
    
    // Convenience method to check if quantity is sufficient
    public boolean hasQuantity(int requestedQuantity) {
        return quantity >= requestedQuantity;
    }
}
