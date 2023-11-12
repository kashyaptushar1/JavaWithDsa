// Find the max element in the Array.
public class Question3 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,4,9,8,7,6};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum element is: "+max);
    }
}
