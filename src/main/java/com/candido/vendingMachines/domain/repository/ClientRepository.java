package com.candido.vendingMachines.domain.repository;

import com.candido.vendingMachines.domain.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
