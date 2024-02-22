/*
Author :- Rajeshwari
Write a program to print addition of odd numbers and addition ofeven numbers
purpose :- for loop
Date:- 15/2/24
*/
public class p17 {
    public static void main(String[] args) 
    {
        int temp=0,temp1 =0;
        for(int i=1;i<=10;i++)
        {
            if(i%2==0){
                temp=temp+i;
            }
        }
        System.out.println("Addition of Even numbers is "+temp);

        for(int i=1;i<=10;i++)
        {
            if(i%2==1){
                temp1=temp1+i;
            }
        }
        System.out.println("Addition of odd numbers is "+temp1);
    }
}
