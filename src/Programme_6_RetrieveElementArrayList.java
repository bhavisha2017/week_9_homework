import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Programme_6_RetrieveElementArrayList {

    public void retrieveElements() {

        // Create a list and add some colors to the list
        ArrayList<String> list = new ArrayList<String>();
        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("White");
        list.add("Black");

        // Print the list
        System.out.println(list);

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an index
        System.out.print("Enter an index: ");
        int index = scanner.nextInt();

        // Retrieve the element at the specified index
        if (index >= 0 && index < list.size()) {
            String element = list.get(index);
            System.out.println("Element at index " + index + ": " + element);
        } else {
            System.out.println("Index out of range.");
        }
        // Close the Scanner object
        scanner.close();
    }
    public static void main(String[] args) {
        //calling instance method in main method
        Programme_6_RetrieveElementArrayList obj = new Programme_6_RetrieveElementArrayList();
        obj.retrieveElements();
    }
}

