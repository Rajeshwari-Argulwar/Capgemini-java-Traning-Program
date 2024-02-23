/*
Author :- Rajeshwari
Write a program to print even and odd numbers from an array and make two diffrent array to store them
purpose :- Array 
Date:- 22/2/24
*/
public class p30 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,54,67,6,75,678,6,8788,53,65,645,654654,657,56765};
        int e[]=new int[19];
        int o[]=new int[19];
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                e[i]=a[i];
            }
            else{
                o[i]=a[i];
            }
            System.out.println(e[i]);
            System.out.println(o[i]);
        }
        
        
    }
}
