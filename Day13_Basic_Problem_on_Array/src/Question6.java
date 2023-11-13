// Count the number of Element strictly greater than value x.
public class Question6 {
    static  int strictlyGreater(int arr[] , int x){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Count the Number bigger Than 5: " +strictlyGreater(arr,5));
    }
}
