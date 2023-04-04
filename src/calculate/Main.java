package calculate;

import java.util.Scanner;

public class Main  {// class 2

    public static void main(String[] args) {

        //creating scanner object
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b = sc.nextByte();
        System.out.println("Please enter one of symbol ( +,-,*,/): ");
        char symbol = sc.next().charAt(0);
        //closing the scanner object
        sc.close();

        Calculator obj = new Calculator();
        obj.calculateResult(a,b,symbol);
        Main obj1 = new Main();
        char ch;

        while (symbol == 'Y' || symbol == 'N') {
            System.out.println("Would you like to do more calculation please enter  Y  or  N  :");
        }
        if (symbol == 'Y') {
            System.out.println("Please enter first number: ");

        }else{
            System.out.println("Goodbye!");
        }


    }


}