/*
Author :- Rajeshwari
Write a program to input any alphabet and check whether it is vowel or consonant
purpose :- 
Date:- 14/2/24
*/
public class p12 {
    public static void main(String[] args) {
        char character = '1';

        if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
            System.out.println("The character '" + character + "' is an alphabet.");

            if(character=='A'|| character== 'a'|| character=='E'||character=='e'|| character=='I'||character=='i'|| character=='O'||character=='o'||character=='U'||character=='u' ){
                System.out.println("The character " + character +" is Vowel");
            }
            else{
                System.out.println("The character is not a vowel");
            }
        } else {
            System.out.println("The character '" + character + "' is not an alphabet.");
        }
    }
    
}
