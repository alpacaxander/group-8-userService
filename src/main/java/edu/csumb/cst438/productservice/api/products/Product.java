package edu.csumb.cst438.productservice.api.products;

import org.springframework.data.annotation.Id;

public class Product {

    @Id
    public String id;

    public String name;
    public String description;
    public int stock;
    public double price;
    public Catagory catagory;
    public Manufacturer manufacturer;


    public Product() {}

    public Product(String name, String description, int stock, double price, Catagory catagory, Manufacturer manufacturer) {
        this.name = name;
        this.description = description;
        this.stock = stock;
        this.price = price;
        this.catagory = catagory;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return null;
    }

}