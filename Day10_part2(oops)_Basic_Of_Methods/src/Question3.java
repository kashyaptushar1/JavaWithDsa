import java.util.Scanner;

//Write a Java method to count all vowels in a string
public class Question3 {
    static int count(String s){
        int count = 0;
        int n = s.length();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.next();
        System.out.println(" Vowels Count is: " +count(str));
    }
}
