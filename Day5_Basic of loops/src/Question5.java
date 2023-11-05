// Print the first multiple of 5 which is also a multiple of 7.
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        while(true){
            if ((n%5==0) && (n%7==0)){
                System.out.println("Found ans: "+n);
                break;
            }
            n++;
        }
    }
}
