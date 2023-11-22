import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Basic {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(3);
        numbers.add(1);

        // Displaying the original ArrayList
        System.out.println("Original ArrayList: " + numbers);

        // Accessing elements
        System.out.println("Element at index 2: " + numbers.get(2));

        // Checking if an element exists
        boolean containsThree = numbers.contains(3);
        System.out.println("Contains '3'? " + containsThree);

        // Finding the index of an element
        int indexOfEight = numbers.indexOf(8);
        System.out.println("Index of '8': " + indexOfEight);

        // Size of the ArrayList
        int size = numbers.size();
        System.out.println("Size of ArrayList: " + size);

        // Sorting the ArrayList
        Collections.sort(numbers);
        System.out.println("Sorted ArrayList: " + numbers);

        // Reversing the ArrayList
        Collections.reverse(numbers);
        System.out.println("Reversed ArrayList: " + numbers);

        // Copying elements from one ArrayList to another
        ArrayList<Integer> copiedList = new ArrayList<>(numbers);
        System.out.println("Copied ArrayList: " + copiedList);

        // Sublist of the ArrayList
        ArrayList<Integer> sublist = new ArrayList<>(numbers.subList(1, 4));
        System.out.println("Sublist: " + sublist);

        // Removing an element
        numbers.remove(Integer.valueOf(3));
        System.out.println("ArrayList after removing '3': " + numbers);

        // Clearing the ArrayList
        numbers.clear();
        System.out.println("ArrayList after clearing: " + numbers);

        // Checking if the ArrayList is empty
        boolean isEmpty = numbers.isEmpty();
        System.out.println("Is ArrayList empty? " + isEmpty);
    }
}
