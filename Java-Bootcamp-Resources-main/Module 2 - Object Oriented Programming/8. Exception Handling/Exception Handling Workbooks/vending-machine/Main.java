import java.util.Scanner;

import models.Item1;
import models.Machine1;

public class Naim3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("\t************************************************");
        System.out.println("\t             WELCOME TO JAVA DRINKS!            ");
        System.out.println("\t************************************************");

        Item1[][] item1s = new Item1[][] {
            { new Item1("Pepsi", 1.99, -3) , new Item1("Fresca", 1.49, 3), new Item1("     ", 2.49, -2) },
            { new Item1("Fanta", 1.99, 2) , new Item1("      ", 1.49, 2), new Item1("A & W", 2.49, 3) },
            { new Item1("     ", 1.99, 2) , new Item1("C-Cola", 1.49, 2), new Item1("Berry", -2.49, 1) }
        };   

        Machine1 machine1 = new Machine1(item1s);

        System.out.println(machine1);

        while (true) {
            System.out.print("Pick a row: ");
            int row = scan.nextInt();
            System.out.print("Pick a spot in the row: ");
            int spot = scan.nextInt();

            machine1.dispense(row, spot);
            System.out.println("\n" + machine1);
            System.out.print("\nEnjoy your drink! Press 1 to purchase another: ");
            if (!scan.next().equalsIgnoreCase("1")) {
                break;
            }
        }
        scan.close();
    }
}
