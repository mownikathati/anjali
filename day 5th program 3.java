public class SystemLimitChecker {

    public static void main(String[] args) {

        // Read configuration values from system properties
        int maxUsers = Integer.parseInt(System.getProperty("max.users", "100"));
        double threshold = Double.parseDouble(System.getProperty("threshold", "80.0"));
        boolean featureFlag = Boolean.parseBoolean(System.getProperty("feature.enabled", "false"));
        String environment = System.getProperty("env.name", "DEV");

        // Print configuration
        System.out.println("Environment      : " + environment);
        System.out.println("Max Users        : " + maxUsers);
        System.out.println("Threshold        : " + threshold);
        System.out.println("Feature Enabled  : " + featureFlag);

        // Validate limits
        if (maxUsers > threshold) {
            System.out.println("⚠ WARNING: Max users exceed threshold limit!");
        } else {
            System.out.println("✅ System limits are within threshold.");
        }
    }
}
