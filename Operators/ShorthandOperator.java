
import java.util.Scanner;

public class ShorthandOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num1 = input.nextInt();
        System.out.print("Value of num1 : " + num1+"\n");
        System.out.print("Enter a number which you want to add in num1 : ");
        int num2 = input.nextInt();
        num1 += num2; //Shorthand Operator.
        System.out.print("Sum : "+num1);
    }
}
