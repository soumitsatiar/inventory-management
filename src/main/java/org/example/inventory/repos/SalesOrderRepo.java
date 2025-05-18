package org.example.inventory.repos;

import org.example.inventory.entities.SalesOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesOrderRepo extends JpaRepository<SalesOrder, Long> {

}
