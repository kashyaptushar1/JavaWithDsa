// Write a java program for convert a Binary number to Decimal Number.
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binaryNo = sc.nextLine();

        int decimal = 0;
        int power = 0;

        for (int i = binaryNo.length() - 1; i >= 0; i--) {
            char bit = binaryNo.charAt(i);
            if (bit == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }

        System.out.println("Decimal equivalent: " + decimal);


    }
}
