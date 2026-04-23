package oops;

public class OOP10String3Immutable {
  public static void main(String[] args) {
    String name = "Satyam";
    System.out.println("Name before Changing : "+name);
    name = "Kumar";//Don't think name is update, a new object for name with Kumar created in memory and previous is ready for garbage collection.
    System.out.println("Name after Changing : " + name);
    // Let's try to update literal of name-->
    name.concat(" Jha");
    System.out.println(name);
  }
}
