package src.test;

import org.junit.Test;
import src.main.MainCheckout;

import static org.junit.Assert.assertEquals;

public class CheckoutTest {
    MainCheckout mc = new MainCheckout();

    @Test
    public void subtotalIsValid(){

        double actual = mc.getsubtotal();
        double expected = 19.2;
        assertEquals(expected,actual,0.00001);


    }
    @Test
    public void taxTotal(){
        double actual = mc.getsubtotal() * .13;
        double expected = 2.496;
        assertEquals(expected,actual,0.000001);
    }

    @Test
    public void total(){
        double actual = (mc.getsubtotal() * .13) + mc.getsubtotal();
        double expected = 21.696;
        assertEquals(expected,actual,0.00001);
    }
}
