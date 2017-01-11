package com.myproject.booksandcds.model;

import android.support.annotation.NonNull;

import java.io.Serializable;
import java.math.BigDecimal;

public abstract class Product implements Serializable, Comparable<Product> {

    protected static final Integer TYPE_BOOK = 0;
    protected static final Integer TYPE_DISC = 1;

    private Integer type;
    private Integer subType;
    private String name;
    private BigDecimal price;
    private String barCode;

    public Product(Integer type, Integer subType, String name, BigDecimal price, String barCode) {
        this.type = type;
        this.subType = subType;
        this.name = name;
        this.price = price;
        this.barCode = barCode;
    }

    public Integer getType() {
        return type;
    }

    public Integer getSubType() {
        return subType;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getBarCode() {
        return barCode;
    }

    @Override
    public int compareTo(@NonNull Product product) {
        int comp;
        comp = this.getType().compareTo(product.getType());

        if (comp == 0) {
            comp = this.getSubType().compareTo(product.getSubType());
        }

        if (comp == 0) {
            comp = this.getName().compareTo(product.getName());
        }

        return comp;
    }
}