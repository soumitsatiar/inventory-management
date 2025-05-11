package org.example.inventory.dtos;

import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Data
@Component
public class ProductDTO {
    private Long id;
    private String name;
    private String description;
    private Double price;
    private Long vendorId;
}
