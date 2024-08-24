package com.candido.vendingMachines.domain.repository;

import com.candido.vendingMachines.domain.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
