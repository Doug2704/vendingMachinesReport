package com.candido.vendingMachines.domain.repository;

import com.candido.vendingMachines.domain.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}
