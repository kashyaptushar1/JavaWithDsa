import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //This is how you take input string.
        //sc.next() not take string after space
        //sc.nextLine() take string after space
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Your name is: " +name);
    }
}