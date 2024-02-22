/*
Author :- Rajeshwari
Write a program check a given number is palindrome or not  
number=454
purpose :- test-1
Date:- 17/2/24
*/
public class p24 {
    public static void main(String[] args) {
        int number = 454;
        int originalNumber = number;
        int reversedNumber = 0;
        
        while (number != 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }
        
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
    }
}
