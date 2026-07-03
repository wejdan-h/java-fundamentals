import java.util.Scanner;

public class ProductCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();

        double product = num1 * num2 * num3;

        System.out.println("The product is: " + product);
        
        scanner.close();
    }
}
