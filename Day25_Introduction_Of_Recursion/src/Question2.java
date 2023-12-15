import java.util.Scanner;

public class Question2 {
    static void PrintDecreasing(int n){
        // First: We write Base case in Recursive function
        if(n==1){
            System.out.println(1);
            return;
        }
        // Second: We write selfwork in method
        System.out.println(n);
        // Last: Recursive work
        PrintDecreasing(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No: ");
        int n = sc.nextInt();
        PrintDecreasing(n);

    }
}
