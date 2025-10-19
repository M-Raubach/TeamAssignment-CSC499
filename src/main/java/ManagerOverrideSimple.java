public class ManagerOverrideSimple {
    public static void main(String[] args) {
        int apple = 2;
        int water = 3;
        int total = apple + water;

        System.out.println("Total before override: $" + total);

        boolean managerApproved = true;
        int discount = 2;

        if (managerApproved) {
            total = total - discount;
            System.out.println("Manager override applied: -$" + discount);
        }

        System.out.println("Total after override: $" + total);

        int payment = 10;
        System.out.println("Customer pays: $" + payment);
        System.out.println("Change: $" + (payment - total));
    }
}
