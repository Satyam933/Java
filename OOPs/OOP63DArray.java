package oops;

public class OOP63DArray {
  public static void main(String[] args) {
    int arr[][][] = new int[3][3][2];
    for (int n[][] : arr) {
      for (int m[] : n) {
        for (int j = 0; j < m.length; j++) {
          m[j] = (int) (Math.random() * 10);
        }
      }
    }

    for (int n[][] : arr) {
      for (int m[] : n) {
        for (int elements : m) {
          System.out.print(elements + " ");
        }
      }
      System.out.println();
    }
  }
}
