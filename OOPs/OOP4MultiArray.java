package OOPs;
public class OOP4MultiArray{
  public static void main(String[] args) {
    int arr[][] = new int[3][4];//2-D array having 3 different array with 4 elements in each/3-rows and 4-columns.
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 4; j++) {
        arr[i][j] = (int) (Math.random() * 10);
      }
    }
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 4; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println("Printing By Enhanced For loop : ");
    for(int n[] : arr){
      for (int m : n) {
        System.out.print(m + " ");
      }
      System.out.println();
    }
  }
}