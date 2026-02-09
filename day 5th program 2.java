/*
 * This program is used in production support to validate
 * whether a machine has JDK installed and explain JVM/JRE/JDK.
 *
 * -------------------------------------------
 * COMPILATION FLOW:
 * -------------------------------------------
 * javac JdkJreValidation.java
 *
 * - 'javac' exists ONLY in JDK
 * - If this command succeeds, JDK is installed
 * - If it fails, only JRE (or no Java) is present
 *
 * -------------------------------------------
 * EXECUTION FLOW:
 * -------------------------------------------
 * java JdkJreValidation
 *
 * - JVM loads the compiled .class file
 * - JRE libraries are used at runtime
 */

public class JdkJreValidation {

    public static void main(String[] args) {

        // System properties fetched from JVM at runtime
        String javaVersion = System.getProperty("java.version");
        String javaVendor = System.getProperty("java.vendor");
        String javaHome = System.getProperty("java.home");

        System.out.println("==== Java Runtime Environment Validation ====");
        System.out.println("Java Version : " + javaVersion);
        System.out.println("Java Vendor  : " + javaVendor);
        System.out.println("Java Home    : " + javaHome);
        System.out.println();

        /*
         * Explanation logs for support teams
         */
        System.out.println("==== JVM vs JRE vs JDK ====");
        System.out.println("JVM:");
        System.out.println("- Executes Java bytecode (.class files)");
        System.out.println("- Platform dependent");
        System.out.println();

        System.out.println("JRE:");
        System.out.println("- JVM + core libraries");
        System.out.println("- Used only to RUN Java applications");
        System.out.println("- Does NOT contain compiler (javac)");
        System.out.println();

        System.out.println("JDK:");
        System.out.println("- JRE + development tools");
        System.out.println("- Contains javac (compiler)");
        System.out.println("- Required to COMPILE Java applications");
        System.out.println();

        /*
         * Practical validation message
         */
        System.out.println("==== Validation Result ====");
        System.out.println("If this program compiled successfully,");
        System.out.println("JDK is installed on this server.");
        System.out.println("If compilation failed earlier,");
        System.out.println("only JRE or no Java was present.");
    }
}

