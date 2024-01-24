import java.util.Scanner;

public class DigitCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = readNum(scanner);

        System.out.println("Enter the operator (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        System.out.println("Enter the second number:");
        int num2 = readNum(scanner);

        String result = calculateNum(operator, num1, num2);
        System.out.println(result);
    }

    private static int readNum(Scanner scanner) {
        int input;
        do {
            System.out.println("Please enter a two-digit number:");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a two-digit number:");
                scanner.next();
            }
            input = scanner.nextInt();
        } while (input < 10 || input > 99);

        return input;
    }

    private static String calculateNum(char operator, int num1, int num2) {
        if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
            return "Invalid operator. Please use '+', '-', '*', or '/'.";
        }

        if (operator == '/' && num2 == 0) {
            return "Division by zero is undefined. Please provide a non-zero divisor.";
        }

        int result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
        }

        return "The result of " + num1 + " " + operator + " " + num2 + " is: " + result;
    }
}
