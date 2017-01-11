package com.myproject.booksandcds.model.discs;

import com.myproject.booksandcds.model.Product;

import java.math.BigDecimal;

public class DVD extends Disc {
    public DVD(String name, BigDecimal price, String barCode, String content) {
        super(Product.TYPE_DISC, Disc.SUBTYPE_DISC_DVD, name, price, barCode, content);
    }
}
