public class typeConversion {
    public static void main(String[] args) {
        //Implicit Conversion ----> Coercion
        short s = 150;
        int i = s; // short automatic converted to in by compiler.
        System.out.println("value of int from short : "+i);
        
        //Explicit Conversion ---> casting
        float f = 10f;
        int in = (int) f; // or direct int in = (int) 10f;
        System.out.println("value of int from float : "+in);
    }
}
