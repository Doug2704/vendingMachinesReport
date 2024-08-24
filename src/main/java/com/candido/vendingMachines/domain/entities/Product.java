package com.candido.vendingMachines.domain.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productId;

    @Column(nullable = false)
    private int position;

    @Column(nullable = false)
    @ManyToOne
    @JoinColumn(name = "id_machine")
    private Machine machine;

    @Column(nullable = false)
    @ManyToOne
    @JoinColumn(name = "id_sale")
    private Sale sale;
}
