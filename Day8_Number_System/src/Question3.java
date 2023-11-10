// Write a java program for convert a Binary number to Octal Number.
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binaryNo = sc.nextLine();
        if (!binaryNo.matches("[01]+")) {
            System.out.println("Aapke duara dyle kiya gya number Binary number nhi hai 🕵️‍♀️");
            return;
        }
        while (binaryNo.length() % 3 != 0) {
            binaryNo = "0" + binaryNo;
        }
        int binaryLength = binaryNo.length();
        StringBuilder octal = new StringBuilder();
        for (int i = 0; i < binaryLength; i += 3) {
            String binaryGroup = binaryNo.substring(i, i + 3);
            int decimalValue = Integer.parseInt(binaryGroup, 2);
            octal.append(Integer.toOctalString(decimalValue));
        }

        System.out.println("Octal No: " + octal.toString());
    }
}
