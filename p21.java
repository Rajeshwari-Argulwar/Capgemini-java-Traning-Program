/*
Author :- Rajeshwari
Write a program to print Weekday of week from number
purpose :- loop,scanner
Date:- 17/2/24
*/
import java.util.Scanner;

public class p21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the week number (1-7): ");
        int weekNumber = scanner.nextInt();
        scanner.close();
        String dayOfWeek;
        if (weekNumber == 1) {
            dayOfWeek = "Monday";
        } else if (weekNumber == 2) {
            dayOfWeek = "Tuesday";
        } else if (weekNumber == 3) {
            dayOfWeek = "Wednesday";
        } else if (weekNumber == 4) {
            dayOfWeek = "Thursday";
        } else if (weekNumber == 5) {
            dayOfWeek = "Friday";
        } else if (weekNumber == 6) {
            dayOfWeek = "Saturday";
        } else if (weekNumber == 7) {
            dayOfWeek = "Sunday";
        } else {
            dayOfWeek = "Invalid week number. Please enter a number between 1 and 7.";
        }
        
        System.out.println("The day of the week is: "+ dayOfWeek );
        
    }
}
