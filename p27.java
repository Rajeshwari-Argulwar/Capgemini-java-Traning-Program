/*
Author :- Rajeshwari
print this pattern 

1
12 
123
1234
12345
123456
1234567
12345678
12345678
1234567
123456
12345
1234
123
12
1

purpose :- test-1
Date:- 17/2/24
*/
public class p27 {
    public static void main(String[] args) {
        int n = 8;
    
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}

