package oops;

public class OOP9StringMethods {
  public static void main(String[] args) {
    String name = "Satyam";
    String name2 = "Saty";
    System.out.println("Name : " + name);
    System.out.println("Length of name : " + name.length());
    System.out.println("Character in name at 2nd index : " + name.charAt(2));
    System.out.println("SubString from index 0 to 4 : " + name.substring(0, 4));
    System.out.println("Is name == name2 : " + name.equals(name2));
    System.out.println("Uppercase of name : " + name.toUpperCase());
    System.out.println("Lowercase of name : "+name.toLowerCase());
  }
}