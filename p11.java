/*
Author :- Rajeshwari
Write a program to check whether a character is alphabet or not
purpose :- 
Date:- 14/2/24
*/
public class p11{
    public static void main(String[] args) {
        char character = '4';

        if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
            System.out.println("The character '" + character + "' is an alphabet.");
        } else {
            System.out.println("The character '" + character + "' is not an alphabet.");
        }
    }
}
