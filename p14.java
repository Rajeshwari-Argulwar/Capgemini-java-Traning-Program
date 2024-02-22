/*
Author :- Rajeshwari
Write a program to use Scanner
purpose :- Scanner class
Date:- 15/2/24
*/

import java.util.*;
public class p14 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+1;
            System.out.println("Sum is"+sum);
        }
        sc.close();
    }
    
}
