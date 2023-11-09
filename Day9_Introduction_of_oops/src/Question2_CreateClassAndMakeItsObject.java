// Create a class of person name and make an object of person class.
public class Question2_CreateClassAndMakeItsObject {
    static class person{
        // Ye hai person naam ki class.
        // or age and name yha pr attributes hai.
        int age = 18;
        String name;
    }
    public static void main(String[] args) {
        person obj = new person();// or ise khte hai class ka object banana.
        obj.name = "Tushar";// is ki help se class me declare variable ko initialize krte hai
        System.out.println("Name: "+obj.name);// or ese print krte hai variable ko jo class mai hai
        System.out.println("My age: "+obj.age);
    }
}
