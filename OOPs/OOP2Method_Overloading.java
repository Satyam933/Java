package oops;

class MethodOverloading {
  public int add(int num1, int num2) {
    return num1 + num2;
  }

  public int add(int num1, int num2, int num3) {
    return num1 + num2 + num3;
  }

  public double add(double num1, int num2) {
    return num1 + num2;
  }

  public double add(int num1, double num2) {
    return num1 + num2;
  }
  
/*Changing return type of method is not enough  
  public long add(int num1, int num2) { 
    return num1 + num2;
  }
*/
}
public class OOP2Method_Overloading {
  public static void main(String[] args) {
    MethodOverloading obj = new MethodOverloading();
    double result = obj.add(50.55, 50);
    System.out.println(result);
  }
}
