/*
Author :- Rajeshwari
Write a code for Method to calculate the product of three numbers
purpose :- function in java
Date:- 01/03/24
*/
import java.util.Scanner;

public class p40 {
    public int calculateProduct(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        p40 calculator = new p40();

        System.out.println("Enter the first number:");
        int number1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int number2 = scanner.nextInt();

        System.out.println("Enter the third number:");
        int number3 = scanner.nextInt();

        int product = calculator.calculateProduct(number1, number2, number3);

        System.out.println("The product of the three numbers is: " + product);

        scanner.close();
    }
}
