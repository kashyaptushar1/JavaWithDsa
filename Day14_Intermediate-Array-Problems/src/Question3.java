// Find the unique number in a given Array where all the element are repeated twice
// with one value being unique.
// Note: Not -ve value present in Array
// Example: 1 2 3 4 3 2 1
// Answer: unique value is: 4

//इस प्रश्न में, आपको एक सूची दी गई है जहां सभी तत्व(Element) दो बार दोहराए गए हैं, लेकिन एक तत्व(Element) एक बार ही दोहराया गया है।
//        आपको उस अद्वितीय मूल्य को खोजना है जो सूची में केवल एक बार है। इस उदाहरण में, अद्वितीय मूल्य है 4,
//        क्योंकि इसे केवल एक बार ही सूची में देखा जाता है।

import java.util.Scanner;

public class Question3 {
    static int findUnique(int arr[]){
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i]>0){
                ans = arr[i];
            }
        }
        return ans;
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

        System.out.println("The unique number is: "+findUnique(arr));

    }
}
