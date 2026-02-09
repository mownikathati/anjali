public class BillingService {

    public static void main(String[] args) {

        // 1. Accept double amount (received from API / UI / client)
        double receivedAmount = 1234.75;

        // 2. Explicit casting: double → int
        int storedAmount = (int) receivedAmount;

        // 3. Log precision loss
        double precisionLoss = receivedAmount - storedAmount;

        System.out.println("Received Amount (double): " + receivedAmount);
        System.out.println("Stored Amount (int): " + storedAmount);
        System.out.println("Precision Lost: " + precisionLoss);

        // 4. Implicit casting example (int → double)
        int tax = 100;
        double taxDouble = tax; // implicit casting

        System.out.println("Tax (int): " + tax);
        System.out.println("Tax after implicit casting (double): " + taxDouble);
    }
}

