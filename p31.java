/*
Author :- Rajeshwari
Write a program to print Maximum and Minimum Values from an array 
purpose :- Array 
Date:- 22/2/24
*/
public class p31 {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50,60,70,80,90};
        int max = a[0];
        int min =a[0];
        for (int i=0;i<a.length;i++){
                if(a[i]>max){
                    max=a[i];
                }
                if(a[i]<min){
                    min=a[i];
                }
        }
        System.out.println("maximum of the array is : "+ max);
        System.out.println("minimum of the array is : "+ min);
    }
}
