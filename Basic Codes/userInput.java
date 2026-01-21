import java.util.Scanner;
public class userInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter a Integer : ");
        int i = input.nextInt();
        System.out.print("Enter a Floating value : ");
        float f = input.nextFloat();
        System.out.print("Enter a Character  : ");
        char c = input.next().charAt(0);
        input.nextLine();
        System.out.print("Enter a String : ");
        String name = input.nextLine();

        System.out.println("\n\nInteger : " + i);
        System.out.println("Float : " + f);
        System.out.println("Character : " + c);
        System.out.println("String : " + name);
        input.close();
    }
}