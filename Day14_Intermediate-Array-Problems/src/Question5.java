// Aman👶: "Hey Tushar, I need to find the first repeating value in an array of integers.
// If none is repeated, I should return -1. Can you help?"

// Tushar👨‍💻: "Of course, Aman! We'll iterate through the array, keeping track of seen values.
// The moment we find a value we've seen before, we return it as the first repeating value.
// If we finish without finding one, we return -1."

// Aman👶: "Okay, but why does it return 3 for {1, 2, 3, 4, 3, 2, 1}? Shouldn't 4 be the answer since
// it's also repeated?"

// Tushar👨‍💻: "Good catch, Aman. We're looking for the first repeating value. In that array, 3 is the first value
// to repeat after 1, 2, and 4. So, even though 4 repeats later, we care about the first repeating value,
// which is 3."

// Aman👶: "Got it! It's about the first occurrence of a value repeating."

// Tushar👨‍💻: "Exactly. If you want the first occurrence of 4 repeating, you'd modify the code.
// But for this problem, we stop at the first repeating value."

// Aman👶: "Thanks for explaining, Tushar. Can You Code"

// Tushar👨‍💻: Yes.👇
import java.util.Scanner;

public class Question5 {
  static int firstRepeatingNumber(int arr[]){
      int n = arr.length;
      for (int i = 0; i < n; i++) {
          for (int j = i+1; j < n; j++) {
              if (arr[i] == arr[j]){
                  return arr[i];
              }
          }
      }
      return -1;
  }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the Element: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("The first Repeating Number is: "+firstRepeatingNumber(arr));

    }
}
