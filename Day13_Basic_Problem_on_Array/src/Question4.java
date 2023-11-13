// Count the number of Occurrence of a particular element x
// 😉 कोई संख्या Array मे कितनी बार आई है। उसे गिनने को count the occurene कहते है।
public class Question4 {
    static void countOccurence(int arr[] , int x){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x){
                count++;
            }
        }
        System.out.print(count);
    }
    public static void main(String[] args) {
        int arr[] = {1,7,3,5,7,9,1,7,2,1,5,1};
        countOccurence(arr,1);

    }
}
