//Print the value between 1 and 50 except for the multiples of 3.
public class Question6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i%3==0){
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
