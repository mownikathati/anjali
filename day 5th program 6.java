public class UserAccessValidation {

    public static void main(String[] args) {

        int age = 22;
        boolean hasValidId = true;
        boolean hasActiveSubscription = false;

        // Validate access using relational & logical operators
        if (age > 18 && hasValidId && hasActiveSubscription) {
            System.out.println("✅ Access Granted");
        } else {
            System.out.println("❌ Access Denied");
        }
    }
}
