//Relational operators are used to compare values and return a boolean result.
public class RelationalOperators {
    public static void main(String[] args) {
        int a= 10, b = 5, c = 10;
        System.out.println("EqualTo operator(==): "+(a==b));//f
        System.out.println("EqualTo operator(==): "+(a==c));//t
        System.out.println("NotEqualTo operator(!=): "+(a!=b));//t
        System.out.println("NotEqualTo operator(!=): "+(a!=c));//f
        System.out.println("GreaterThen operator(>): "+(a>b));//t
        System.out.println("GreaterThen operator(>): "+(b>c));//f
        System.out.println("LessThen operator(<): "+(b<a));//t
        System.out.println("LessThen operator(<): "+(a<b));//f
        System.out.println("GreaterThanEqualsTo(>=): "+(a>=c));//t
        System.out.println("GreaterThanEqualsTo(>=): "+(b>=c));//f
        System.out.println("LessThanEqualsTo(<=): "+(a<=b));//f
        System.out.println("LessThanEqualsTo(<=): "+(a<=c));//t
    }
}
