import models.Pants;
import models.Shirt;

public class Naim0 {
  
    static final String FILE_NAME = "products.txt";

    public static void main(String[] args) {
        Shirt shirt = new Shirt(Shirt.Size.SMALL, 1.09, "red", "Munir");
        Pants pants = new Pants(36, 2.99, "blue", "Ghamay");
        Shirt shirt2 = new Shirt(shirt);
shirt.fold();
pants.fold();
    }
    /**
     * Function Name: getData
     * @return Product[]
     * @throws FileNotFoundException
     * 
     * Inside the function:
     *   1. Loads the data from products.txt
     */
}
