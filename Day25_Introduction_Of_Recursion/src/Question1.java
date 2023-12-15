//Write a Program to print the all natural number from 1 to n using recursion.
import java.util.Scanner;

public class Question1 {
    // Yeh function ek digit ko ek baar mein badhata hai aur use print karta hai
    static void PrintIncreasing (int n){
        // Agar n ki Value 1 hai, to seedhe 1 ko print karo aur return
        if (n == 1){
            System.out.println(1);
            return;
        }
        // n-1 ke liye recursive call karo
        PrintIncreasing(n-1);
        // Fir n ko print karo
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int n = sc.nextInt();
        PrintIncreasing(n);
    }
}
