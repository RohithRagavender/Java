package practice;

// //Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name.
// Test Data
// Input number: 3
// Expected Output :
// Wednesday
import java.util.*;
public class question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(n==1)
        {
            System.out.println("Monday");
        }        
        else if(n==2)
        {
            System.out.println("Tuesday");
        }
        else if(n==3)
        {
            System.out.println("Wednesday");
        }
        else if(n==4)
        {
            System.out.println("Thuresday");
        }
        else if(n==5)
        {
            System.out.println("Friday");
        }
        else if(n==6)
        {
            System.out.println("Saturday");
        }
        else if(n==7)
        {
            System.out.println("Sunday");
        }
        else
        {
            System.out.println("Invalid Input");
        }
        sc.close();
    }
}
