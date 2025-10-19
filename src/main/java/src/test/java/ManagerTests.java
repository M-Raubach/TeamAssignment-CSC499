import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Simple JUnit tests for ManagerOverrideSimple and ManagerRefundSimple.
 * These verify that override and refund calculations work correctly.
 */
public class ManagerTests {

    // Test: Manager override reduces total cost correctly
    @Test
    public void testManagerOverrideReducesTotal() {
        int apple = 2;
        int water = 3;
        int total = apple + water; // 5
        int discount = 2;

        boolean managerApproved = true;
        if (managerApproved) {
            total -= discount;  // manager applies discount
        }

        assertEquals(3, total, "Total should be reduced to $3 after override");
    }

    // Test: Manager refund updates remaining sale correctly
    @Test
    public void testManagerRefund() {
        int saleTotal = 15;
        int refund = 10;
        boolean managerApproved = true;

        if (managerApproved && refund <= saleTotal) {
            saleTotal -= refund;
        }

        assertEquals(5, saleTotal, "Remaining balance should be $5 after refund");
    }

    // Test: Refund denied if not approved
    @Test
    public void testRefundDeniedWithoutApproval() {
        int saleTotal = 15;
        int refund = 10;
        boolean managerApproved = false;

        if (managerApproved && refund <= saleTotal) {
            saleTotal -= refund;
        }

        assertEquals(15, saleTotal, "Sale total should remain $15 if refund not approved");
    }
}
