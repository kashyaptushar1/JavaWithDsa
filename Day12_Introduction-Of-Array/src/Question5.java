public class Question5 {
    static class operation{
        void  sum(int arr[]){
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
            }
            System.out.println("Sum of Element is: "+sum);
        }

        void  multiply(int arr[]){
            int mul = 1;
            for (int i = 0; i < arr.length; i++) {
                mul = mul * arr[i];
            }
            System.out.println("Multiply of Element is: "+mul);
        }

        void maximum(int arr[]){
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]>max){
                    max = arr[i];
                }
            }
            System.out.println("Maximum Element is: "+max);
        }

        void Minimum(int arr[]){
            int min = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]<min){
                    min = arr[i];
                }
            }
            System.out.println("Maximum Element is: "+min);
        }

        void size(int arr[]){
            System.out.println("Size of Array is: "+arr.length);
        }
    }
    public static void main(String[] args) {
        operation op = new operation();
        int arr[] = {1,2,3,4,5,9,8,7,6};
        op.sum(arr);
        op.size(arr);
        op.multiply(arr);

    }
}
