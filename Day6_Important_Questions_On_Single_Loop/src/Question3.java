// Reverse the digits of a number.
// when Original number == Reverse number
// Then, Original number is called Palindrome
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int n = sc.nextInt();
        int ans = 0;
        while (n>0){
            ans = ans*10+n%10;
            n = n/10;
        }
        System.out.print("Reverse is: "+ans);
    }
}
