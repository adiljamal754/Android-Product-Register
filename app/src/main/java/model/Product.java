package model;

import java.util.Date;

public class Product {

    public String name;
    public double price;
    public int quantity;
    public String validate;

    public Product(String name, double price, int quantity, String validate) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.validate = validate;
    }
}
