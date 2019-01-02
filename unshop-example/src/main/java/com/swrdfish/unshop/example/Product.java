package com.swrdfish.unshop.example;

import com.swrdfish.unshop.database.Model;

import java.util.List;


public class Product extends Model {
    private String name;
    private List<ProductVariant> variants;
}
