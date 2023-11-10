// Print the area of shapes using methods of Rectangle , Square , Circle.
import java.util.Scanner;

public class Question2 {
    static class shapes{
        int rectangle(int l, int b){
            return l*b;
        }
        int square(int a){
            return a*a;
        }
        float circle(int r){
            return 3.14f*r*r;
        }
    }
    public static void main(String[] args) {
        shapes sh = new shapes();
        Scanner sc = new Scanner(System.in);
        System.out.println("Area of Rectangle is: "+sh.rectangle(4,5));
        System.out.println("Area of Square: "+sh.square(5));
        System.out.println("Area of circle is: "+sh.circle(7));

    }
}
