/*
Author :- Rajeshwari
print this pattern 

*
**
***
****
*****
******


purpose :- test-1
Date:- 17/2/24
*/public class p26 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

