//Write a java program to print the value. if it is even (AND) divisible by 3.
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int n = sc.nextInt();
        if (n%2==0 && n%3==0){
            System.out.println("Found Ans: " +n);
        }



    }
}
