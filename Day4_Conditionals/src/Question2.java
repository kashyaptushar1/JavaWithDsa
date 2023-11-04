//Write a java program to print the value. if it is divisible by 3 or 5.
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int n = sc.nextInt();
        if (n%3==0 || n%5==0){
            System.out.println("Found Ans: "+n);
        }
    }
}
