// Arithmetic operation using methods.
import java.util.Scanner;

public class Question1 {
    static class operation{
        public void sum(int a , int b){// and a,b is parameter jo Argument ko store krte hai
            System.out.println("sum is: "+(a+b));
        }
        public void sub(int a , int b){
            System.out.println("subtraction is: "+(a-b));
        }
        public void mul(int a , int b){
            System.out.println("Multiplication is: "+(a*b));
        }
        public void div(int a , int b){
            System.out.println("Divide is: "+(a/b));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        operation op = new operation();
        op.sum(3,5);// there number is argument,jo ki ja kr parameter mai store honge.
        op.sub(17,9);
        op.mul(3,9);
        op.div(9,3);
    }
}
