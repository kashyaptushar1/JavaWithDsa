// Find the last occurrence of an element X in a given array.
//  😉Last occurrence मतलब target element array मे किस index पर है। उस index को return करना है।
public class Question5 {
    static int lastOccurrence(int arr[] , int x){
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x){
                idx = i;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,3,4,5,8,4,9,10};
        System.out.println("Index of last Occurrence: "+lastOccurrence(arr,4));

    }
}
