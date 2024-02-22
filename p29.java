/*
Author :- Rajeshwari
Write a program to print sum of array 
purpose :- Array
Date:- 22/2/24
*/
public class p29 {
    public static void main(String[] args) {
        {
            /*int[]a;
            int a1[];
            int a2[];
            int []a3,b;
            int a4[],b1;
            */
            //ceation of arrays
            int []a={ 10,30,40};
            int sum=0;
            for (int i=0;i<a.length;i++){
                sum=sum+a[i];
            }
            System.out.println("sum of array is = "+sum);    
        }
    }
}