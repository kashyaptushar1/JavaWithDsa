//Write a program to divide people into 3 age groups depending upon their age.
// Below or equal to 12 : child
//Between 12-18 : Teenager
// above 18: Adult


import java.util.Scanner;

public class DividePeople {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age: ");
        int age = sc.nextInt();
        if (age<=12){
            System.out.println("You are child");
        } else if (age>12 && age<18) {
            System.out.println("You are teenager");
        }
        else {
            System.out.println("You are Adult");
        }
    }
}
