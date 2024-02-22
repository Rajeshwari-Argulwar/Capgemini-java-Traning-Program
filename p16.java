/*
Author :- Rajeshwari
Write a program to print addition of even numbers from 1 to 10
purpose :- for loop
Date:- 15/2/24
*/
public class p16 {
    public static void main(String[] args) 
    {
        int temp=0;
        for(int i=1;i<=10;i++)
        {
            if(i%2==0){
                temp=temp+i;
            }
        }
        System.out.println("Addition of Even numbers is "+temp);
    }
}
