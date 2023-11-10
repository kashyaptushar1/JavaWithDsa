public class BasicOfConstructor {
    String name;
    int rollNo;
    double persent;
    public BasicOfConstructor(String name , int rollNo, double persent){// This is constructor
        this.name = name;
        this.rollNo = rollNo;
        this.persent = persent;
    }
    // Note:- Constructor name = class name
    public static void main(String[] args) {
        BasicOfConstructor st1 = new BasicOfConstructor("Tushar", 21, 92.2);
        BasicOfConstructor st2 = new BasicOfConstructor("Vanshika",12, 98.8);
        System.out.println("Name is: "+st2.name);
        System.out.println("Name is: "+st1.name);


    }
}
