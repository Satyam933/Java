package oops;

public class OOP11String4Builder {
  public static void main(String[] args) {
    StringBuilder name = new StringBuilder("Satyam");//Initial capacity (16) + str length (6) = 22
    System.out.println("Before Modifying Name : " + name);
    System.out.println("Before Modifying Capacity : " + name.capacity());//Initial capacity is 16 which is used when we append or add some characters to initial StringBuilder.
    name.append(" Jha");//Works properly without creating new object in memory.
    System.out.println("After Modifying Name : " + name);
    System.out.println("After Modifying Capacity : "+name.capacity());
  }
}