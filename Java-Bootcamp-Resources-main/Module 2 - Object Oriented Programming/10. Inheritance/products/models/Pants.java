package models;

public class Pants extends Product {
    private int waist;


    public Pants(int waist, double price, String color, String brand) {
        super(price, color, brand);
        this.waist = waist;
    }
}
