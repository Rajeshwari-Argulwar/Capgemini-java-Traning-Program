/*
Author :- Rajeshwari
Write a program to print matrics Left to right 
purpose :- 2D Array 
Date:- 23/2/24
*/
public class p39
{
    public static void main(String[] args) 
    {   
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        for(int i=0;i<=3;i++)
        {
            for(int j=0;j<=3;j++)
            {
                if(i>=1)
                {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
    
        }
    }
}
    
