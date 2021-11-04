package models;

import java.util.Objects;

public class Shirt extends Product{
    private String size;

    public Shirt(String size, double price, String color, String brand){
        super(price, color, brand);
        this.size = size;
    }

    public Shirt(Shirt source){
        super(source);
        this.size = source.size;
    }
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Shirt)) {
            return false;
        }
        Shirt shirt = (Shirt) o;

        return Objects.equals(size,shirt.size)
                && super.getPrice() == shirt.getPrice()
                && super.getColor() == shirt.getColor()
                && super.getBrand() == shirt.getBrand();
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, super.getPrice(), super.getBrand(), super.getColor());
    }
}
