// Find the min element in the Array.
public class Question4 {
    public static void main(String[] args) {
        int arr[] = {10,2,3,5,4,9,8,7,1,6};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Minimum  element is: "+min);
    }
}
