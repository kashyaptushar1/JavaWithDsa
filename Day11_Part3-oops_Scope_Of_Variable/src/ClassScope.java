public class ClassScope {
    static  class operation{
        int a = 5;// These  are class scope variable
        int b = 3;//It means we can use there variable everywhere in this class
        int sum (){
            return a+b;// a=5, b=3
        }
        int sub (){
            return a-b;// a=5, b=3
        }
        int mul (){
            return a*b;// a=5, b=3
        }
    }
    public static void main(String[] args) {
        operation op = new operation();
        System.out.println("Sum is: "+op.sum());// kyuki hmne value class ki help se di hai
        System.out.println("Sub is: "+op.sub());// tho hme Argument dene ki jrurt nhi hai
        System.out.println("Mul is: "+op.mul());// or jb hmne Argunemt hi nhi diye tho parameter kiske liye bnege,
        // Remember Parameter , Argument ko store krne ke liye hote hai.
    }
}
