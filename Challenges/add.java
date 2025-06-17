
import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        System.out.print("Enter two numbers : ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Sum : " + (a + b));
        
        input.close();
        }
}
