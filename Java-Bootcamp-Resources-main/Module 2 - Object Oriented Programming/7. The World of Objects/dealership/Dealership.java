public class Dealership {
    private Car1[] car1s;

    public Dealership(Car1[] car1s) {
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

    /** Task 2 - Re-write the search action.
     * Function name: search
     *
     * @param make (String)
     * @param budget (int)
     * @return (int)
     *
     * Inside the function:
     *   1. Loops through every element in the cars field.
     *   2. Skips the run if the element is null.
     *   3. If it finds a car the user can afford:
     *     • println: \nWe found a car in spot <i> \n\n <toString>
     *     • print: If you're interested, type 'yes':
     *     • returns the index
     *   4. If the loop runs and it didn't find a car
     *     • println: \nYour search didn't match any results.\n
     *     • returns 404
     */
    public String search(String make, int budget) {
        for (int i = 0; i < this.car1s.length; i++) {
            if (this.car1s[i] == null) {
                continue;
            } else if (this.car1s[i].getMake().equals(make) && this.car1s[i].getPrice() <= budget) {
                return "\nWe found one in spot " + i + "\n" + this.car1s[i].toString() + "\nAre you interested ?";
            }
        }
        return "Sorry, we couldn't find any cars.";
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
