//- Write a program which takes the values of length and breadth from user and check if it is
//a square or not.
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int l = sc.nextInt();
        System.out.println("Enter the width: ");
        int w = sc.nextInt();
        if (l==w){
            System.out.println("This is a square");
        }
        else{
            System.out.println("This is not a Square");
        }
    }
}
