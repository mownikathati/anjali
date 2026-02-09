
public class SystemHealthCheck {

    public static void main(String[] args) {

        // Sample inputs (can be replaced with real metrics)
        double totalCPU = 100;     // in percentage
        double usedCPU = 82;       // used CPU %

        double totalMemory = 16384; // in MB
        double usedMemory = 12000;  // used memory in MB

        // Arithmetic operations
        double cpuUsagePercent = (usedCPU / totalCPU) * 100;
        double memoryUsagePercent = (usedMemory / totalMemory) * 100;

        // Ternary operator for health status
        String cpuStatus = cpuUsagePercent <= 75 ? "Healthy" : "Critical";
        String memoryStatus = memoryUsagePercent <= 75 ? "Healthy" : "Critical";

        // Output
        System.out.println("===== System Health Check =====");
        System.out.println("CPU Usage % : " + cpuUsagePercent);
        System.out.println("CPU Status  : " + cpuStatus);

        System.out.println("Memory Usage % : " + memoryUsagePercent);
        System.out.println("Memory Status  : " + memoryStatus);
    }
}
