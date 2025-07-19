public class data_type {
    public static void main(String[] args) {
        //Primmitive Data Types
        byte a = 10;
        short b = 180;
        int c = 10000000;
        long d = 1000000000;
        float e = 10f;
        double f = 10.55555d;
        char g = 'S';
        boolean h = true;
        
        //Non-Primitive Data Types
        String i = "Hello, World!";
        int arr[] = { 1, 2, 3, 4, 5 };
        
        System.out.println("Primitive Data Types:");
        System.out.println("Byte: " + a);
        System.out.println("Short: " + b);
        System.out.println("Integer: " + c);
        System.out.println("Long: " + d);
        System.out.println("Float: " + e);
        System.out.println("Double: " + f);
        System.out.println("Character: " + g);
        System.out.println("Boolean: " + h);
        System.out.println("\nNon-Primitive Data Types:");
        System.out.println("String: " + i);
        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
}
