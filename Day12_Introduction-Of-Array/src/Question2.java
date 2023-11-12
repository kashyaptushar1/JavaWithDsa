// Find the multiplication of Array Element
public class Question2 {
    public static void main(String[] args) {
        int arr[] = {1,2,5,4,1};
        int mul = 1;
        for (int i = 0; i < arr.length; i++) {
            mul = mul*arr[i];
        }
        System.out.println("Multiplication of Element: "+mul);
    }
}
