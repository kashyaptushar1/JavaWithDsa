import java.util.Scanner;

//- Given an unsorted array arr[] of size N having both negative and positive integers, place
//all negative elements at the end of array without changing the order of positive elements
//and negative elements
public class Question8_Imp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size Of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the Element(+ve/-ve both): ");
            arr[i] = sc.nextInt();
        }
        int ans[] = new int[n];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i]>=0){
                ans[idx] = arr[i];
                idx++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i]<0){
                ans[idx] = arr[i];
                idx++;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
