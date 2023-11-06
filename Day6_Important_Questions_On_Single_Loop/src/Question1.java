//Count the number of digit for a given number n.
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        // This code not count Digit more then 9
        // for count digit more then 9 we change
        // long n = sc.nextLong();

        int digits = 0;
        while(n>0){
            n = n/10;
            digits++;
        }
        System.out.println("The Number of Digits in this number: "+digits);
    }
}
