// Count the number of triplets whose sum is equal to the given value x.
//Example:
// Array: 1 4 6 6 3 , Target: 12.
// Ans: 2
// Pair1:{1 , 5 , 6}
// Pair2:{4 , 5 , 3}

//इस प्रश्न में, आपको एक सूची दी गई है और एक लक्ष्य मान दिया गया है। आपको सूची में इस तरह के तिगुणों (तीन संख्याओं के जोड़ों)
// की कुल संख्या निकालनी है जिनका योग लक्ष्य के समान है। इस उदाहरण में, तिगुण1 {1, 5, 6} और तिगुण2 {4, 5, 3} हैं जिनका योग 12 है।

import java.util.Scanner;

public class Question2 {
    static  int tripletsSum(int arr[] , int t){
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if(arr[i]+arr[j] +arr[k] == t){
                        count++;
                    }
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

        System.out.println("The Count of pair: "+tripletsSum(arr,tar));
    }
}