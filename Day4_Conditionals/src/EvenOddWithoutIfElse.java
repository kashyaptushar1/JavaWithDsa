import java.util.Scanner;

public class EvenOddWithoutIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int n = sc.nextInt();
        String ans;
        ans = (n%2==0)?"Even" : "odd";
        System.out.println(ans);

    }
}
