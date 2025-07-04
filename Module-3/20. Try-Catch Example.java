import java.util.Scanner;
public class TryCatchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numerator: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the denominator: ");
        int num2 = sc.nextInt();
        try {
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        sc.close();
    }
}
