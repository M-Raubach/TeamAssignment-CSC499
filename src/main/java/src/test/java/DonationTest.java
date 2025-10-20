package main.tests.java;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// Simple testing for adding donations to the total

public class DonationTest {
    
    @Test
    public void testDonation(){
        
        double donation = 1.00;
        double total = 0.00;
    
            if (donation > 0.00){
                total += donation;
            }
            else {
                System.out.println("Donation amount invalid.");
            }
            
            assertEquals(1.00, total, "New total should have added the donation amount.");

    }

    
}
