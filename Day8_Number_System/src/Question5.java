// Write a java code to convert a Binary number to a HexaDecimal No
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binaryNo = sc.nextLine();
        if (!binaryNo.matches("[01]+")) {
            System.out.println("Aapke duara dyle kiya gya number Binary number nhi hai ❎");
            return;// isliye taki aage check hi na ho
        }

        int binaryNo2 = Integer.parseInt(binaryNo, 2);
        String hexadecimalString = Integer.toHexString(binaryNo2).toUpperCase();
        System.out.println("Hexadecimal equivalent: " + hexadecimalString);
    }
}
