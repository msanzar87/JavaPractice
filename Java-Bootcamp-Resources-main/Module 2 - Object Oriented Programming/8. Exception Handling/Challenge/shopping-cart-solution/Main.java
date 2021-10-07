import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import models.Cart;
import models.Item1;
import models.Store;

public class Naim3 {

    static Store store = new Store();
    static Cart cart = new Cart();
    public static void main(String[] args) {
        try {
            loadItems("products.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            manageItems();
        }
    }

    /**
     * Name: manageItems
     * Inside the function:
     *   • 1. Starts a new instance of Scanner;
     *   • 2. Creates an infinite loop:     
     *   •        The user can choose to a) add or b) remove c) checkout.
     *   •          case a: asks for the aisle and item1 number. Then, adds item1 to cart.
     *   •          case b: asks for the name. Then, removes item1 from cart.
     *   •          case c: prints the receipt and closes Scanner.
     *   •        Prints the updated shopping cart.
     */

     public static void manageItems() {
         Scanner scan = new Scanner(System.in);
         while (true) {
            System.out.println("\n\t******************************JAVA GROCERS******************************\n");
            System.out.println(store);

            System.out.println("Options: \n\ta) Add to cart\n\tb) Remove from cart \n\tc) Checkout");
            String response = scan.nextLine();

            switch (response) {
                case "a": 
                  System.out.print("\nChoose an aisle number between: 1 – 7: ");
                  int row = scan.hasNextInt() ? scan.nextInt() - 1 : 404;
                  scan.nextLine();
                  System.out.print("Choose an item1 number between: 1 – 3: ");
                  int column = scan.hasNextInt() ? scan.nextInt() - 1 : 404;
                  scan.nextLine();
                  if (row == 404 || column == 404) {
                      continue;
                  } else if (row < 0 || row > 6 || column < 0 || column > 2) {
                      continue;
                  }
                  Item1 item1 = store.getItem(row, column);
                  if (!(cart.add(item1))) {
                      System.out.println(item1.getName() + " is already in your shopping cart.");
                  } else {
                      System.out.println(item1.getName() + " was added to your shopping cart.");
                  }
                  break;
                case "b":
                  if (cart.isEmpty()) {
                      continue;
                  }
                  System.out.print("Enter the item1 you'd like to remove: ");
                  cart.remove(scan.nextLine());
                  break;
                case "c":
                  if (cart.isEmpty()) {
                      continue;
                  }
                  System.out.println(cart.checkout());
                  scan.close();
                  return;
                default: continue;
            }

            System.out.println("\n\nSHOPPING CART\n\n" + cart);
            System.out.print("Enter anything to continue: ");
            scan.nextLine();

            
         }
     }


   /**
    * Name: loadItems
    * @param fileName (String)
    * @throws FileNotFoundException
    *
    * Inside the function:
    *   1. loads item1s from <fileName>.txt.
    *      • while loop runs through every line in <fileName>
    *      • scan.nextLine() picks up the entire line.
    *      • splits each String using the ";" separator.
    *      • splits both fields in each String using the "=" separator.
    *      • Parse each price into a Double.
    *   2. adds all item1s to the store object's item1s field.
    */

    public static void loadItems(String fileName) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Scanner scanFile = new Scanner(fis);
        for (int i = 0; scanFile.hasNextLine(); i++) {
            String line = scanFile.nextLine();
            String[] item1s = line.split(";");
            for (int j = 0; j < item1s.length; j++) {
                String[] fields = item1s[j].split("=");
                store.setItem(i, j, new Item1(fields[0], Double.parseDouble(fields[1])));
            }
        }
        scanFile.close();
    }
 
}
