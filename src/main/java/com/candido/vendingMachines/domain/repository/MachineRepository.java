package com.candido.vendingMachines.domain.repository;

import com.candido.vendingMachines.domain.entities.Machine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MachineRepository extends JpaRepository<Machine, Long> {
}
