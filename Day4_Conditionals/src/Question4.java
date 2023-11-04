//- Write a program to print absolute value of a number entered by the user.
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int n = sc.nextInt();
        if (n<0){
            n = n*-1;
            System.out.println("Absolute no: " +n);
        }
        else if(n>0){
            System.out.println("Absolute value is: " +n);
        }
        else{
            n = n*0;
            System.out.println("value is: "+n);
        }
    }
}
