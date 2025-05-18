package org.example.inventory.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.example.inventory.entities.Details;
import org.example.inventory.entities.ItemAndQuantity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SalseOrderRequest {
    private Double total;
    private Details address;
    private List<ItemAndQuantity> cart;
}
