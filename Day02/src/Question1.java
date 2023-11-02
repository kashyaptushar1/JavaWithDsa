import java.util.Scanner;

//- Input name, roll number and field of interest from user and print in the format below :
//        Name: xyz, Roll number: xyz, Field of interest: xyz
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name: ");
        String name = sc.nextLine();
        System.out.println("Enter the rollNo: ");
        int rollNo = sc.nextInt();
        System.out.println("Enter your field of Interest: ");
        String field = sc.next();
        System.out.println();
        System.out.println("Your name is: "+name);
        System.out.println("Your RollNo is: "+rollNo);
        System.out.println("Field of interest: "+field);
    }
}
