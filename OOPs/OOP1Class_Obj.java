package OOPs;
class Sum {
  public int runSum(int num1, int num2) {
    return num1 + num2;
  }
}
public class OOP1Class_Obj {
  public static void main(String[] args) {
    int num1 = 10;
    int num2 = 30;
    Sum obj = new Sum();
    int result = obj.runSum(num1, num2);
    System.out.println(result);
  }
}
