public class RuntimeEnvironmentCheck {

    public static void main(String[] args) {

        // Java details
        String javaVersion = System.getProperty("java.version");
        String javaVendor = System.getProperty("java.vendor");

        // OS details
        String osName = System.getProperty("os.name");
        String osArch = System.getProperty("os.arch");

        // Print details
        System.out.println("===== Runtime Environment Validation =====");
        System.out.println("Java Version      : " + javaVersion);
        System.out.println("JVM Vendor        : " + javaVendor);
        System.out.println("Operating System : " + osName);
        System.out.println("OS Architecture  : " + osArch);
    }
}
