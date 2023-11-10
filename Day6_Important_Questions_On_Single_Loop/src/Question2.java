// Find the sum of digits in a given number n.
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int n = sc.nextInt();
        int sum = 0;
        int reminder;
        while(n>0){
            reminder = n%10;
            sum = sum + reminder;
            n = n/10;
        }
        System.out.println("The sum of Digits is: "+sum);
    }
}
//The provided program can calculate the sum of the digits of an integer until
// there are no more digits left to add. It keeps adding digits until the variable 'n' becomes zero.
// Therefore, this program can handle an integer with any number of digits.

//It will work correctly for integers of any size, as long as it fits within the range of integer values
// that Java supports. The maximum value that can be stored in a 32-bit signed
// integer (which is the default for Java's `int` data type) is 2,147,483,647. If the input integer
// exceeds this value, you may run into issues related to overflow, but for integers within this range,
// the program will work as expected.