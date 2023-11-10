import java.util.Scanner;

public class InputByUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.nextLine();//this is how to take input String
        System.out.println("Enter the rollNo: ");
        int rollNo = sc.nextInt();//This is how to take input Integers
        System.out.println("Enter the percentage: ");
        float per = sc.nextFloat();//This is how to take input float
        System.out.println("Data: ");
        System.out.println(name);
        System.out.println(rollNo);
        System.out.println(per);
    }
}
