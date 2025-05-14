package org.example.inventory.dtos;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class InventoryCartDTO {
    private Long productId;
    private Integer quantity;
}
