package org.example.inventory.repos;

import org.example.inventory.entities.Details;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailsRepo extends JpaRepository<Details, Long> {
}
