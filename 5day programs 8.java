import java.util.Scanner;

public class ServiceMenuApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n=== Admin Service Management Menu ===");
            System.out.println("1. Start Service");
            System.out.println("2. Stop Service");
            System.out.println("3. Restart Service");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    startService();
                    break;

                case 2:
                    stopService();
                    break;

                case 3:
                    restartService();
                    break;

                case 4:
                    System.out.println("Exiting application... Bye Admin 👋");
                    sc.close();
                    return; // exits program

                default:
                    System.out.println("Invalid choice! Please select 1-4.");
            }
        }
    }

    static void startService() {
        System.out.println("Service started successfully ✅");
    }

    static void stopService() {
        System.out.println("Service stopped successfully ⛔");
    }

    static void restartService() {
        System.out.println("Service restarted successfully 🔄");
    }
}
