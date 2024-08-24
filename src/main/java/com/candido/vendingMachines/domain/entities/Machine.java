package com.candido.vendingMachines.domain.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity

public class Machine {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_machine")
    private long machineId;

    @Column(nullable = false)
    private String machineCode;

    @Column(nullable = false)
    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;

    @OneToMany(mappedBy = "machines")
    private List<Product> products;
}
