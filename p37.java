/*
Author :- Rajeshwari
Write a program to print matrics upside down 
purpose :- 2D Array 
Date:- 23/2/24
*/
public class p37
{
    public static void main(String[] args) 
    {   
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        for(int i=3;i>=0;i--)
        {
        
            for(int j=0;j<=3;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    
    }
}