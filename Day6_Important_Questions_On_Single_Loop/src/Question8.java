// Print the Fibonacci Series
// Example: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...

import java.util.Scanner;
public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for series: ");
        int n = sc.nextInt();
        int firstTerm = 0;
        int secondTerm = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

    }
}
