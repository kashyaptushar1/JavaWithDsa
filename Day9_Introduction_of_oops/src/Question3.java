 class student{
    String name;
    int rollNo;
    String dateOfBirth;
}
public class Question3 {
    public static void main(String[] args) {
        student stu1 = new student();// First object of student class.
        stu1.name = "Tushar";
        stu1.rollNo = 10;
        stu1.dateOfBirth = "11-11-2004";
        student stu2 = new student();// second object of student class.
        stu2.name = "Ashish";
        stu2.rollNo = 1;
        stu2.dateOfBirth = "8-11-2004";
        System.out.println("Detail of first student: ");
        System.out.println("Name: "+stu1.name);
        System.out.println("RollNo: "+stu1.rollNo);
        System.out.println("Date Of Birth: "+stu1.dateOfBirth);
        System.out.println();
        System.out.println("Detail of second student: ");
        System.out.println("Name: "+stu2.name);
        System.out.println("RollNo: "+stu2.rollNo);
        System.out.println("Date of Birth: "+stu2.dateOfBirth);
        // issme hmne student class ke two object bna liye.
        // arthat hm ek class ke kitne bhi objects bna skte hai
    }
}
