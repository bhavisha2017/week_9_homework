
 // Write a Java program to test if an array list is empty or not

 import java.util.ArrayList;
 import java.util.Scanner;

 public class Programme_7_TestArrayListEmpty {

    public  void arrayEmptyOrNot() {
        //Create an empty arraylist
        ArrayList<String> c1= new ArrayList<String>();
        // Use Scanner to get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to add to the list (or type 'exit' to stop): ");

        // Loop to keep adding input to the list until the user types 'exit'
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            c1.add(input);
            System.out.print("Enter another string (or type 'exit' to stop): ");
        }

        // Check if the ArrayList is empty or not
        if (c1.isEmpty()) {
            System.out.println("The ArrayList is empty");
        } else {
            System.out.println("The ArrayList is not empty");
        }

        //closing scanner
        scanner.close();
    }

     public static void main(String[] args) {
         Programme_7_TestArrayListEmpty obj = new Programme_7_TestArrayListEmpty();
         obj.arrayEmptyOrNot();
     }
}

