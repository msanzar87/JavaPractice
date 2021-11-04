package models;

public class Shirt{
    private String size;
    private String color;
    private double price;
    private String brand;

    public Shirt(String size, double price, String color, String brand){
        this.size = size;
        this.price = price;
        this.color = color;
        this.brand = brand;
    }
}
