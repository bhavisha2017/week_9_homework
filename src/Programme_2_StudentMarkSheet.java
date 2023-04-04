import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if
 * %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */

public class Programme_2_StudentMarkSheet {

    public void studentMarkSheet() {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        String name;
        int rollNo, mathsMarks, scienceMarks, englishMarks, totalMarks;
        double percentage;
        String result, grade;
        System.out.println("Enter Student Name     : ");
        name = scanner.next();
        System.out.println("Enter student Roll Number : ");
        rollNo = scanner.nextInt();

        //using while loop
        while (true) {
            System.out.println("Enter Marks of Subject Maths : ");
            mathsMarks = scanner.nextInt();
            if (mathsMarks >= 0 && mathsMarks <= 100) {
                break;
            } else {
                System.out.print("Invalid input, Marks should between 0 to 100");
                System.out.print("Please enter correct marks:");
                mathsMarks = scanner.nextInt();
            }
        }

        while (true) {
            System.out.print("Enter Marks of Subject Science: ");
            scienceMarks = scanner.nextInt();
            if (scienceMarks >= 0 && scienceMarks <= 100) {
                break;
            } else {
                System.out.println("Invalid input, Marks should between 0 to 100");
                System.out.print("Please enter correct marks:");
                scienceMarks = scanner.nextInt();
            }
        }

        while (true) {
            System.out.print("Enter Marks of Subject English: ");
            englishMarks = scanner.nextInt();
            if (englishMarks >= 0 && englishMarks <= 100) {
                break;
            } else {
                System.out.println("Invalid input, Marks should between 0 to 100");
                System.out.print("Please enter correct marks: ");
                englishMarks = scanner.nextInt();

            }
        }
        totalMarks = mathsMarks + scienceMarks + englishMarks;
        percentage = (double) totalMarks / 3;
        result = percentage >= 35 ? "Pass" : "Fail";
        //using if else
        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else if (percentage >= 35) {
            grade = "C";
        } else {
            grade = "Fail";
        }

        System.out.println("|------------------------------|");
        System.out.println("|             MARK SHEET       |");
        System.out.println("|------------------------------|");
        System.out.println("|Name: " + name + "                   |");
        System.out.println("|Roll No: " + rollNo + "                    |");
        System.out.println("|------------------------------|");
        System.out.println("|Subject      Marks            |");
        System.out.println("|------------------------------|");
        System.out.println("|Math         " + mathsMarks + "               |");
        System.out.println("|Science      " + scienceMarks + "               |");
        System.out.println("|English      " + englishMarks + "               |");
        System.out.println("|------------------------------|");
        System.out.println("|Total Marks  " + totalMarks + "              |");
        System.out.println("|Percentage   " + percentage + "%" + "            |");
        System.out.println("|Result       " + result + "             |");
        System.out.println("|Grade        " + grade + "               |");
        System.out.println("|------------------------------|");
    }

    public static void main(String[] args) {
        //object creation
        Programme_2_StudentMarkSheet obj = new Programme_2_StudentMarkSheet();
        obj.studentMarkSheet();
    }
}




