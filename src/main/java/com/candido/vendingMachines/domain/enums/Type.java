package com.candido.vendingMachines.domain.enums;

public enum Type {

    statistics("Estatísticas"),
    statisticsReport("Relatório de Estatísticas");

    private String saleType;

    private Type(String type) {
        this.saleType = type;
    }
}
