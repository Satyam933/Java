package oops;

class Student {
  int rollNum;
  String name;
  double marks;
}
public class OOP7ArrayObj {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.rollNum = 1;
    s1.name = "Satyam";
    s1.marks = 80.78;

    Student s2 = new Student();
    s2.rollNum = 1;
    s2.name = "Shivam";
    s2.marks = 90.78;

    Student students[] = new Student[2];
    students[0] = s1;
    students[1] = s2;
    for (Student n : students) {
      System.out.println(n.rollNum + " : " + n.name + " : " + n.marks);
    }
  }
}
