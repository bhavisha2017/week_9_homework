import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterator.
 */

public class Programme_5_IterateArrayList {

    //creating instance method iterateElements
    public void iterateElements() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //Declaring scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the ArrayList: ");
        int size = scanner.nextInt();

        System.out.println("Enter the elements of the ArrayList: ");
        for (int i = 0; i < size; i++) {
            int num = scanner.nextInt();
            list.add(num);
        }

        // Using an Iterator to iterate through the ArrayLis
        Iterator<Integer> iterator = list.iterator();
        System.out.println("Iterating through the ArrayList: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        scanner.close();//closing scanner
    }

    public static void main(String[] args) {
        //calling instance method in main method by creating object
        Programme_5_IterateArrayList obj = new Programme_5_IterateArrayList();
        obj.iterateElements();
    }
}
