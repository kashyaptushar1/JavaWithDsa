import java.util.Scanner;

public class BasicCodeOfMethod {

    // Sum is method name
    // void is return type
    // and a,b is parameter,(Parameter is a variable which store the value of Argument)
    static public void sum(int a , int b){
        System.out.println("Sum is: "+(a+b));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sum(1,2);//Calling a method, And 1 0r 2 is arguments.
        sum(3,5);
    }
}
