/*
Author :- Rajeshwari
Write a program to print a matrix
purpose :- 2D Array 
Date:- 23/2/24
*/
public class p32 
{
    public static void main(String[] args) 
    {   /*int[][] a,b;
        int a1[],b1[];
        int a3,b3[][];
        int [][] arr=new int[3][3];
        arr[0][0]=1;
        arr[0][1]=2;
        arr [0][2]=3;
        arr [1][0]=4;
        arr [1][1]=5;
        arr[1][2]=6;
        arr[2][0]=7 ;
        arr[2][1]= 8;
        arr[2][2]= 9;
        */
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
