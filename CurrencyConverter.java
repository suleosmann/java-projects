import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Conversion rates (example rates, these should be updated according to real-time data)
        double usdToEur = 0.84;
        double usdToGbp = 0.74;
        double usdToInr = 74.57;

        System.out.println("Currency Converter");
        System.out.println("1. USD to EUR");
        System.out.println("2. USD to GBP");
        System.out.println("3. USD to INR");
        System.out.print("Choose an option (1-3): ");
        int choice = scanner.nextInt();

        System.out.print("Enter amount in USD: ");
        double amount = scanner.nextDouble();

        double convertedAmount = 0;
        String targetCurrency = "";

        switch (choice) {
            case 1:
                convertedAmount = amount * usdToEur;
                targetCurrency = "EUR";
                break;
            case 2:
                convertedAmount = amount * usdToGbp;
                targetCurrency = "GBP";
                break;
            case 3:
                convertedAmount = amount * usdToInr;
                targetCurrency = "INR";
                break;
            default:
                System.out.println("Invalid option.");
                System.exit(0);
        }

        System.out.printf("Converted amount: %.2f %s\n", convertedAmount, targetCurrency);
    }
}
