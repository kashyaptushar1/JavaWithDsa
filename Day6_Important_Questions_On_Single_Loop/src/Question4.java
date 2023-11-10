// Find the sum of the following series .
// Series = 1-2+3-4....n
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            if (i%2 == 0){
                ans -= i;
            }
            else {
                ans += i;
            }
        }
        System.out.println("Answer is: "+ans);

    }
}
