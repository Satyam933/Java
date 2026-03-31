package oops;

public class OOP5JagedArray {
  public static void main(String[] args) {
    int arr[][] = new int[3][]; //jagged array
    arr[0] = new int[3];
    arr[1] = new int[4];
    arr[2] = new int[3];
    
    for (int n[] : arr) {
      for (int j = 0; j < n.length; j++) {
        n[j] = (int) (Math.random() * 10);
      }
    }
    
    for (int n[] : arr) {
      for (int m : n) {
        System.out.print(m + " ");
      }
      System.out.println();
    }
  }
}
