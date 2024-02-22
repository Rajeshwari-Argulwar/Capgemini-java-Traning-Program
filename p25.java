/*
Author :- Rajeshwari
Reverse a number by using scanner class
purpose :- test-1
Date:- 17/2/24
*/
import java.util.Scanner;

public class p25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int reversedNumber = 0;
        int number = num;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed number: " + reversedNumber);
        
        scanner.close(); 
    }
}

