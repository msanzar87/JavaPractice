import java.util.Scanner;

class Naim {
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
        

        System.out.println("\n ****** JAVA DEALERSHIP! ****** \n");
        System.out.print("Welcome! Enter the type of car1 you're looking for: ");
        String make = scan.nextLine();
        System.out.print("Enter your budget: ");
        int budget = scan.nextInt();          

        int index = dealership.search(make, budget);

        switch (index) {

            case 404: System.out.println("Feel free to browse through our collection of car1s.\n");
            System.out.println(dealership);
            break;

            default: scan.nextLine();
            String decision = scan.nextLine();
            if (decision.equalsIgnoreCase("yes")) {
                dealership.sell(index);
            }

        }

    scan.close();

    }
}
