package models;

import java.util.Objects;

public class Shirt extends Product{
   public enum Size {
       SMALL, MEDIUM, LARGE
   }
    private Size size;

    public Shirt(Size size, double price, String color, String brand){
        super(price, color, brand);
        this.size = size;
    }

    public Shirt(Shirt source){
        super(source);
        this.size = source.size;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
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

    @Override
    public String toString() {
        return "Shirt{" +
                "size='" + getSize() + '\'' +
                "price=" + super.getPrice() + " " +
                "brand=" + super.getBrand() + " " +
                "color=" + super.getColor() + " " +
                '}';
    }
    @Override
    public void fold(){
        System.out.println("Lay shirt on a flat surface.");
        System.out.println("Fold the shirt sideways.");
        System.out.println("Bring the sleeves in.");
        System.out.println("Fold from the bottom up");
    }
}
