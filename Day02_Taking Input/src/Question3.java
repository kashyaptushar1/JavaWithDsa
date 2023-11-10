import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks: ");
        int marks1 = sc.nextInt();
        System.out.println("Enter the marks: ");
        int marks2 = sc.nextInt();
        System.out.println("Enter the marks: ");
        int marks3 = sc.nextInt();
        System.out.println("The total marks is: "+(marks1+marks2+marks3));
        System.out.println("The persentage is: "+(marks1+marks2+marks3)/3);
    }
}
