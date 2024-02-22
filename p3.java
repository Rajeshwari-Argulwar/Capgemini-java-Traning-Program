/*
Author :- Rajeshwari
write a program to use if-else ladder 
purpose :- for if-else ladder 
Date:-14/2/24
*/
public class p3 {
    public static void main(String[] args){
        int marks = 65;
        if(marks>75 && marks<101){
            System.out.println("Distinction");
        }
        else if(marks>60 && marks<75){
            System.out.println("First Class");
        }
        else if(marks>45 && marks<60){
            System.out.println("Second Class");
        }
        else if(marks>33 && marks<45){
            System.out.println("PASS");
        }
        else if(marks<33){
            System.out.println("Fail");
        }
        else{
            System.out.println("invalid number");
        }

    }
    
}
