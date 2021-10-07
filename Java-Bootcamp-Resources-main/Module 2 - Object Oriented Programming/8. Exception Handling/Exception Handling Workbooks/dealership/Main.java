import java.util.Scanner;

import models.Car1;
import models.Dealership1;

public class Naim3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        Car1[] car1s = new Car1[] {
            new Car1("    ", -5000),
            new Car1("    ", 12000),
        };
        car1s[1].setMake("    ");
        car1s[1].setPrice(-8500);

        Dealership1 dealership = new Dealership1(car1s);

        System.out.println("\n************* JAVA DEALERSHIP *************");
        while (true) {
            System.out.println(dealership);
            System.out.print("Enter the spot number of the car1 you want to buy: ");
            int spot = scan.nextInt();
            dealership.sell(spot);    
        }

       //scan.close();

    }
}
