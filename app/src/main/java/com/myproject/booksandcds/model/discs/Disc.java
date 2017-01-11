package com.myproject.booksandcds.model.discs;

import com.myproject.booksandcds.model.Product;

import java.math.BigDecimal;

public abstract class Disc extends Product {

    static final Integer SUBTYPE_DISC_CD = 3;
    static final Integer SUBTYPE_DISC_DVD = 4;

    public static final String CONTENT_MUSIC = "Music";
    public static final String CONTENT_VIDEO = "Video";
    public static final String CONTENT_SOFTWARE = "Software";

    private String Content;

    Disc(Integer type, Integer subType, String name, BigDecimal price, String barCode, String content) {
        super(type, subType, name, price, barCode);
        Content = content;
    }

    public String getContent() {
        return Content;
    }
}
