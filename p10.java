/*
Author :- Rajeshwari
Write a program to check whether a year is leap year or not
purpose :- for if-else statement
Date:- 14/2/24
*/
public class p10 {
    public static void main(String[] args){
        int num =2016;
        if (num % 4==0 ){
            /*we can not use nested if because it is printing multiple outputs and haveing multiple conditions does 
            not improve precision insted it is giving a confused output*/
            /*if (num % 100 ==0 ){
                if (num % 400 ==0 ){
                    System.out.println("leap year");
                }
                else{
                    System.out.println("Not a leap year");
                }
            }
            else{
                System.out.println("Not a leap year");
            }*/            
            System.out.println("It is a leap year");
        }
        else{
            System.out.println("It is Not a leap year");
        }
    }
}
