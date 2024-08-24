package com.candido.vendingMachines.domain.entities;

import com.candido.vendingMachines.domain.enums.Type;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int saleId;

    @OneToMany(mappedBy = "sales")
    private List<Product> products;

    @Column
    private int total;

    @Column
    private double audit03;
    @Column
    private double audit08;
    @Column
    private double audit09;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Type type;
}
