public class ManagerRefundSimple {
    public static void main(String[] args) {
        int saleTotal = 15;
        System.out.println("Sale completed for: $" + saleTotal);

        boolean managerApproved = true;
        int refund = 10;

        if (managerApproved && refund <= saleTotal) {
            saleTotal = saleTotal - refund;
            System.out.println("Refund approved: $" + refund);
        } else {
            System.out.println("Refund denied.");
        }

        System.out.println("Remaining balance after refund: $" + saleTotal);
    }
}
