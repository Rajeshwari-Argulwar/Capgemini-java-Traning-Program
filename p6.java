/*
Author :- Rajeshwari
Write a program to find maximum between three numbers
purpose :- for if-else statement
Date:- 14/2/24
*/
public class p6 {
    public static void main(String[] args){
        int num1 = 15, num2 = 30, num3 = 58;
        if (num1>num2 && num1>num3){
            System.out.println("Number 1 is greater");
        }
        else if (num2>num1 && num2>num3){
            System.out.println("Number 2 is greater");
        }
        else if (num3>num2 && num3>num1){
            System.out.println("Number 3 is greater");
        }
        else 
        {
            System.out.println("Some Numbers are equal");
        }
    }
}
