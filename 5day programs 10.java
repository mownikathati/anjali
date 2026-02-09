public class records {

    public static void main(String[] args) {

        // Sample batch records
        int[] records = {10, 25, -1, 40, 0, 60, -99, 80};

        System.out.println("Batch Job Started...\n");

        for (int record : records) {

            // Skip invalid record
            if (record == 0) {
                System.out.println("Invalid record found (0). Skipping...");
                continue;
            }

            // Stop job on critical error
            if (record == -99) {
                System.out.println("Critical error detected! Stopping batch job.");
                break;
            }

            // Process valid record
            System.out.println("Processing record: " + record);
        }

        System.out.println("\nBatch Job Finished.");
    }
}
