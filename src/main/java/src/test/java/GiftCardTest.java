package main.tests.java;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * JUnit testing for Gift Card(s)
 * Checking to see if Gift Cards are valid or not.
 */


public class GiftCardTest {

    @Test

    public void testGiftCard(){
        GiftCard gf = new GiftCard(0, true, 5);
        double total = 0.00;
        if (gf.isActivationStatus()){
            if (gf.getAmount() >0){
                total += gf.getAmount();
            }
        }
        else {
            System.out.println("Gift Card is invalid.");
        }

        assertEquals(total, gf.userTotal(), "If gift card is valid and has a valid amount, it should decrement the total by its amount.");
    }

}
