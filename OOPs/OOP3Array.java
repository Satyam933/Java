package OOPs;

public class OOP3Array {
  public static void main(String[] args) {
    int arr1[] = { 1, 2, 3, 4, 5 }; //Normal Array Creation.
    int arr2[] = new int[5]; //Dynamic Allocation as defining size at runtime when this line executes and new runs.
    System.out.print("arr1 before Updation : ");
    for (int i = 0; i < arr1.length; i++) {
      System.out.print(arr1[i]);
    }
    System.out.println();
    System.out.print("arr2 before assinging value : ");
    for (int i = 0; i < arr2.length; i++) {
      System.out.print(arr2[i]);
    }
    System.out.println();
    arr2[0] = 6;
    arr2[1] = 7;
    arr2[2] = 8;
    arr2[3] = 9;
    arr2[4] = 10;
    System.out.print("arr2 after assinging value : ");
    for (int i = 0; i < arr2.length; i++) {
      System.out.print(arr2[i]);
    }
    System.out.println();
    //we not assingn any value to arr[4](default value = 0).
    arr1[0] = 11; //updating value of array.
    System.out.print("arr1 after updating 0th index from 1--->11 : ");
    for (int i = 0; i < arr1.length; i++) {
      System.out.print(arr1[i]);
    }
  }
}
