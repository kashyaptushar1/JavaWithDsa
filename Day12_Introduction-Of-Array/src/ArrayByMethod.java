// Array traversing using object and method .
public class ArrayByMethod{
    static class operation{
        void print(int arr[]){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        operation op = new operation();// object of operation class for Access the Print method
        int arr[] = {1,2,3,4,5};// Making an Array
        op.print(arr);// call print method to print an Array,
    }
}