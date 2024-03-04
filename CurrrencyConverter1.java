import java.util.Scanner;

public class   {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display currency choices
        System.out.println("Welcome to the Currency Converter Program");
        System.out.println("Use the following codes to input your currency choices:");
        System.out.println("1 - US Dollars");
        System.out.println("2 - Euros");
        System.out.println("3 - British Pounds");
        System.out.println("4 - Japanese Yen");

        // Collect user input for base and target currencies
        System.out.print("Please choose the input currency: ");
        int inputCurrency = scanner.nextInt();
        System.out.print("Now choose the output currency: ");
        int outputCurrency = scanner.nextInt();

        // Collect input amount
        System.out.print("Now enter the input amount: ");
        double amountToConvert = scanner.nextDouble();

        // Define exchange rates (you can fetch these from an API in a real-world scenario)
        double euroToDollarRate = 1.18;
        double poundToDollarRate = 1.38;
        double yenToDollarRate = 0.0092;

        // Convert input amount to target currency
        double convertedAmount;
        switch (inputCurrency) {
            case 1:
                convertedAmount = amountToConvert;
                break;
            case 2:
                convertedAmount = amountToConvert * euroToDollarRate;
                break;
            case 3:
                convertedAmount = amountToConvert * poundToDollarRate;
                break;
            case 4:
                convertedAmount = amountToConvert * yenToDollarRate;
                break;
            default:
                System.out.println("Invalid input currency choice.");
                return;
        }

        // Display result
        System.out.printf("%.2f %s at a conversion rate = %.2f US Dollars%n",
                amountToConvert, getCurrencySymbol(inputCurrency), convertedAmount);

        scanner.close();
    }

    // Helper method to get currency symbol
    private static String getCurrencySymbol(int currencyCode) {
        switch (currencyCode) {
            case 1:
                return "US Dollars";
            case 2:
                return "Euros";
            case 3:
                return "British Pounds";
            case 4:
                return "Japanese Yen";
            default:
                return "";
        }
    }
}
