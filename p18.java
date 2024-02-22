/*
Author :- Rajeshwari
Write a program to print sum of even numbers from 1 to 10 by useing do while
purpose :- do-while loop
Date:- 15/2/24
*/
public class p18 {
    public static void main(String[] args) {
        int i =1,sum =0;
        do
        {
            
            i++;
            if(i%2==0){
                sum=sum+i;
            }
        }
        while(i<=10);
        System.out.println("Sum of even numbers"+sum );
    }
}
