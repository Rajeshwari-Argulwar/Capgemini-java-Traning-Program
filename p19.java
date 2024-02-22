
/*
Author :- Rajeshwari
Write a program to print all natural numbers from 1 to n
purpose :- loop,scanner
Date:- 15/2/24
*/
import java.util.*;
public class p19 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i);

        }
        sc.close();
    }
}
