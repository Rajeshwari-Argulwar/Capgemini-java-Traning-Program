/*
Author :- Rajeshwari
Write a program to print sum of 2 matrixs
purpose :- 2D Array 
Date:- 23/2/24
*/
public class p35
{
    public static void main(String[] args) 
    {   
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+arr1[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}