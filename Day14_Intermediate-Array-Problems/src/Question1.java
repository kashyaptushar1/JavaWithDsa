// Find the total number of pairs in the array , Whose sum is equal to the given target value.
// Array: 4 6 3 8 5 2 , Target: 7.
// Here is two pair in this Array , who Sum is equals to target
// pair1 { 4 , 3}
// Pair2 { 5 , 2}

//प्रश्न:
//दिए गए सूची (एरे) में, जिनका योग सूची के एक दिए गए लक्ष्य मान के बराबर हो, उनके कुल कितने जोड़े हैं, इसे ढूंढें।
//उदाहरण:
//सूची: 4 6 3 8 5 2, लक्ष्य: 7।
//इस सूची में दो ऐसे जोड़े हैं, जिनका योग लक्ष्य के बराबर है।
//जोड़1: {4, 3}
//जोड़2: {5, 2}
// 😂😂😂😂😂😅

import java.util.Scanner;

public class Question1 {
    static  int pairSum(int arr[] , int t){
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]+arr[j] == t){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the Element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target value: ");
        int tar = sc.nextInt();

        System.out.println("The Count of pair: "+pairSum(arr,tar));
    }
}
// shi hai beta Pawan😂