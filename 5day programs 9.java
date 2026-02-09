public class ApiRetryExample {

    public static void main(String[] args) {
        int maxRetries = 3;
        int attempt = 1;
        boolean success = false;

        while (attempt <= maxRetries) {
            System.out.println("API Call Attempt: " + attempt);

            success = callApi();

            if (success) {
                System.out.println("API call successful ✅");
                break; // exit early if success
            } else {
                System.out.println("API call failed ❌");
            }

            attempt++;
        }

        if (!success) {
            System.out.println("API call failed after " + maxRetries + " retries");
        }
    }

    // Simulated API call
    private static boolean callApi() {
        // Replace with real API logic
        return Math.random() > 0.7; // success randomly
    }
}
