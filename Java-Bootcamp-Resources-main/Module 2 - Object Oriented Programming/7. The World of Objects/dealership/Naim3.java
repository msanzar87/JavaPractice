import java.util.Scanner;

public class Naim3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        Car1[] car1s = new Car1[] {
            new Car1("Nissan", 5000, 2020, "red", new String[] {"tires", "keys"}),
            new Car1("Dodge", 8500, 2019, "blue", new String[] {"tires", "keys"}),
            new Car1("Nissan", 5000, 2017, "yellow", new String[] {"tires", "filter"}),
            new Car1("Honda", 7000, 2019, "orange", new String[] {"tires", "filter"}),
            new Car1("Mercedes", 12000, 2015, "jet black", new String[] {"tires", "filter", "transmission"})
        };
        
        Dealership1 dealership = new Dealership1(car1s);
        

        /** Task 1 – Add user input.
         *  
         *   System.out.println("\n ****** JAVA DEALERSHIP! ****** \n");
         *   System.out.print("Welcome! Enter the type of car1 you're looking for: ");
         *   //pick up make
         *   System.out.print("Enter your budget: ");
         *   //pick up budget
         * 
         */

        // Task 3 - Call the search action.

        /* Task 4: case 404
               println : Feel free to browse through our collection of car1s.\n
               print the dealership.
        */
        
        /* Task 5 – Selling the car1.
            If it finds a car1, pick up the user's decision.
            If the decision is yes, sell them a car1.
        */

        // Task 6 – Ignore letter cases.

        scan.close();

    }
}

