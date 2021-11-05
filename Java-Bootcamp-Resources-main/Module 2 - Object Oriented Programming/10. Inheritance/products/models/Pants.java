package models;

import java.util.Objects;

public class Pants extends Product implements Discountable {
    private int waist;


    public Pants(int waist, double price, String color, String brand) {
        super(price, color, brand);
        this.waist = waist;
    }
    public Pants(Pants source){
        super(source);
        this.waist = source.waist;

    }

    public int getWaist() {
        return waist;
    }

    public void setWaist(int waist) {
        this.waist = waist;
    }

    @Override
    public void discount(){
        super.setPrice(super.getPrice() / 2);
    }
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Pants)) {
            return false;
        }
        Pants pants = (Pants) o;

        return waist == pants.waist
                && super.getPrice() == pants.getPrice()
                && super.getColor() == pants.getColor()
                && super.getBrand() == pants.getBrand();
    }

    @Override
    public int hashCode() {
        return Objects.hash(waist, super.getPrice(), super.getBrand(), super.getColor());
    }

    @Override
    public String toString() {
        return "{" +
                "waist=" + getWaist() + " " +
                "price=" + super.getPrice() + " " +
                "brand=" + super.getBrand() + " " +
                "color=" + super.getColor() + " " +
                '}';
    }
    @Override
    public void fold(){
        System.out.println("Hold pants upright.");
        System.out.println("Fold one leg over the other.");
        System.out.println("Fold pants from the bottom in thirds.");
    }
}
