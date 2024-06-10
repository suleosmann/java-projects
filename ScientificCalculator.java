import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Scientific Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Power");
            System.out.println("6. Square Root");
            System.out.println("7. Logarithm");
            System.out.println("8. Exponential");
            System.out.println("9. Sine");
            System.out.println("10. Cosine");
            System.out.println("11. Tangent");
            System.out.println("12. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            if (choice == 12) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            double num2 = 0;

            if (choice >= 1 && choice <= 5) {
                System.out.print("Enter the second number: ");
                num2 = scanner.nextDouble();
            }

            switch (choice) {
                case 1:
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Division by zero is not allowed.");
                    }
                    break;
                case 5:
                    System.out.println("Result: " + Math.pow(num1, num2));
                    break;
                case 6:
                    System.out.println("Result: " + Math.sqrt(num1));
                    break;
                case 7:
                    System.out.println("Result: " + Math.log(num1));
                    break;
                case 8:
                    System.out.println("Result: " + Math.exp(num1));
                    break;
                case 9:
                    System.out.println("Result: " + Math.sin(num1));
                    break;
                case 10:
                    System.out.println("Result: " + Math.cos(num1));
                    break;
                case 11:
                    System.out.println("Result: " + Math.tan(num1));
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }

        scanner.close();
    }
}
