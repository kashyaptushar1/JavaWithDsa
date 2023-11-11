public class MethodScope {
    static int sum(){
        int a = 9;//Here a and b is block level scope.
        int b = 3;// inside sum a and b is different and
        return a+b;// outside sum function a and b is different .
    }
    static int sub(){
        int a = 5;//a and b are different
        int b = 2;// a and b are block level scope
        return a-b;
    }
    public static void main(String[] args) {
        System.out.println("Sum is: "+sum());
        System.out.println("Sub is: "+sub());
    }
}
