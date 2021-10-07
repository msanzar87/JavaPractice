public class Dealership1 {
    private Car1[] car1s;

    public Dealership1(Car1[] car1s) {
        this.car1s = new Car1[car1s.length];
        for (int i = 0; i < car1s.length; i++) {
            this.car1s[i] = new Car1(car1s[i]);
        }
    }

    public void setCar(Car1 car1, int index) {
        this.car1s[index] = new Car1(car1);
    }

    public Car1 getCar(int index) {
        return new Car1(this.car1s[index]);
    }

    public void sell(int index) {
        this.car1s[index].drive();
        this.car1s[index] = null;
    }

    public int search(String make, int budget) {
        for (int i = 0; i < this.car1s.length; i++) {
            if (this.car1s[i] == null) {
                continue;
            } else if (this.car1s[i].getMake().equalsIgnoreCase(make) && this.car1s[i].getPrice() <= budget) {
                System.out.println("\nWe found a car in spot " + i + "\n\n" + car1s[i].toString());
                System.out.print("If you're interested, type 'yes': ");
                return i;
            }
        }
        System.out.println("\nYour search didn't match any results.\n");
        return 404;
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.car1s.length; i++) {
            temp += "Parking Spot: " + i + "\n";
            if (this.car1s[i] == null) {
                temp += "Empty\n";
            } else {
                temp += this.car1s[i].toString() + "\n";
            }
        }
        return temp;
    }


}
