
import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        System.out.print("Enter Two numbers : ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Addition : " + (a + b));
        System.out.println("Subtraction : " + (a - b));
        System.out.println("Multiplication : " + (a * b));
        System.out.println("Division : " + (a / b));
        System.out.println("Modulus : "+(a%b));
    }
}
