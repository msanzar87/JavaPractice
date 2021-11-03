package src.main;

public class MainCheckout {

            static double[] prices = new double[] {2.23, 1.32, 4.32, 11.33};

            public static void main(String[] args) {


            }

    public double getsubtotal() {
                double temp = 0;
        for (int i = 0; i < prices.length; i++) {
            temp += prices[i];
        }
        return temp;
    }
}

