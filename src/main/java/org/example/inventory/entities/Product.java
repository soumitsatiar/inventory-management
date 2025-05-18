package org.example.inventory.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double price;

    private Integer quantity = null;

    @Column(columnDefinition = "VARCHAR(255) DEFAULT 'https://encrypted-tbn2.gstatic.com/shopping?q=tbn:ANd9GcQiTBlsAjqkT32Gufujnxr350alQTy0ninn6wb7moSxP6eBG1gz9OTRaaLu0h8o7ZoWTWmnkFy-L_C3kWiH322uDWSZi4DCYzWzoNHeXsUWfReZIjwmTHbl5Q'")
    private String imgUrl;

    @ManyToOne
    @JoinColumn(name = "vendor_id")
    private Vendor vendor;

}
