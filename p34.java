/*
Author :- Rajeshwari
Write a program to print even and odd numbers from matrix
purpose :- 2D Array 
Date:- 23/2/24
*/
public class p34
{
    public static void main(String[] args) 
    {   
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                
                if(arr[i][j]%2==0){
                    System.out.println("even : "+arr[i][j]);
                }
                if(arr[i][j]%2==1){
                    System.out.println("odd : "+arr[i][j]);
                }
            }
            System.out.println();
        }
    }}