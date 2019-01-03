package com.swrdfish.unshop.example;

import com.swrdfish.unshop.admin.Admin;
import com.swrdfish.unshop.admin.BasicAdmin;

import static spark.Spark.path;


public class Application {
    public static void main(String[] args) {
        Admin admin = new BasicAdmin();


        admin.addResource(Product.class);
        admin.addResource(ProductVariant.class);

        path("/admin", admin.getRoutes());
    }
}
