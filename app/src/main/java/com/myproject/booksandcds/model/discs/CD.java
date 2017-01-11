package com.myproject.booksandcds.model.discs;

import com.myproject.booksandcds.model.Product;

import java.math.BigDecimal;

public class CD extends Disc {
    public CD(String name, BigDecimal price, String barCode, String content) {
        super(Product.TYPE_DISC, Disc.SUBTYPE_DISC_CD, name, price, barCode, content);
    }
}
