/*
Author :- Rajeshwari
Write a program to print all natural numbers from n to 1
purpose :- loop,scanner
Date:- 15/2/24
*/
import java.util.*;
public class p20 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=n;i>=1;i--){
            System.out.println(i);
        }
        sc.close();
    }
}
