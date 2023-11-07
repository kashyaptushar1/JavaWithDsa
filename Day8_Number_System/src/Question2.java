// Write a java program for convert a Decimal number to Binary Number.
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        if (decimal < 0) {
            System.out.println("Aapke duara dyle kiya gya number possitive decimal number nhi hai 😂 ");
        } else if (decimal == 0) {
            System.out.println("Binary equivalent: 0");
        } else {
            StringBuilder binary = new StringBuilder();

            while (decimal > 0) {
                int remainder = decimal % 2;
                binary.insert(0, remainder);
                decimal /= 2;
            }

            System.out.println("Binary equivalent: " + binary.toString());
        }


    }
}
