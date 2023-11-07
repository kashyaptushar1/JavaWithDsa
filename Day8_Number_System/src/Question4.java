// Write a java code to convert octal number to Binary number.

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an octal number: ");
        String octalString = sc.nextLine();

        if (!octalString.matches("[0-7]+")) {
            System.out.println("Aapke duara dyle kiya gya number Octal number nhi hai ❎");
            return;
        }

        String binaryString = Long.toBinaryString(Long.parseLong(octalString, 8));

        System.out.println("Binary No: " + binaryString);


    }
}
