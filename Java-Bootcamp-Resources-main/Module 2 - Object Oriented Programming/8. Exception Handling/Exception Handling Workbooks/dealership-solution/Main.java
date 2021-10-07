import java.util.Scanner;

import models.Car1;
import models.Dealership1;

public class Naim3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        Car1[] car1s = new Car1[] {
            new Car1("Nissan", 5000),
            new Car1("Toyota", 12000),
        };
        car1s[1].setMake("Honda");
        car1s[1].setPrice(8500);

        Dealership1 dealership = new Dealership1(car1s);

        System.out.println("\n************* JAVA DEALERSHIP *************");
        while (true) {
            System.out.println(dealership);
            if (dealership.isEmpty()) {
                System.out.println("We're all sold out!");
                break;
            }
            System.out.print("Enter the spot number of the car1 you want to buy: ");
            if (!scan.hasNextInt()) {
                scan.nextLine();
                System.out.println("INVALID INPUT.");
                continue;
            }
            int spot = scan.nextInt();
            scan.nextLine();
            if (spot < 0 || spot > dealership.getLength() - 1) {
                System.out.println("INVALID INDEX.");
                continue;
            } else if (dealership.getCar(spot) == null) {
                System.out.println("EMPTY SPOT.");
                continue;
            }
            dealership.sell(spot);    
            System.out.print("Type 'yes' to continue shopping: ");
            if (!scan.nextLine().equalsIgnoreCase("yes")) {
                break;
            }
        }

       scan.close();

    }
}
