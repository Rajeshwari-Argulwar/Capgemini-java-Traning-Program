/*
Author :- Rajeshwari
write  a program which will calculate the lenghth of a word and if it is odd then prints 
one middle character and if itis even then print two middle chracters  
purpose :- Array
Date:- 29/02/24
*/
public class p41 {
    public static void printMiddleCharacter(String str) {
        int length = str.length();
        
        
        if (length % 2 == 0) {
            
            char middleChar1 = str.charAt(length / 2 - 1);
            char middleChar2 = str.charAt(length / 2);
            System.out.println("Middle characters: " + middleChar1 + middleChar2);
        } else {
            
            char middleChar = str.charAt(length / 2);
            System.out.println("Middle character: " + middleChar);
        }
    }

    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "abcdef";

        System.out.println("String 1:");
        printMiddleCharacter(str1);

        System.out.println("String 2:");
        printMiddleCharacter(str2);
    }
}
