package practice;
/*
 1. Write a Java program to find the number of days in a month.
Test Data
Input a month number: 2
Input a year: 2016
 */
import java.util.*;
public class question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        String y = " ";
        System.out.print("Input a month Number: ");
        int month = sc.nextInt();
        System.out.print("Input a year: ");
        int year = sc.nextInt();
        switch (month) {
            case 1:
                x = 31;
                y = "January";
                break;
            case 2:
                if (year % 4 == 0 || year % 400 == 0 || year % 100 != 0) {
                    x = 29;
                    y = "Feb";
                } else {
                    x = 28;
                    y = "Feb";
                }
                break;
            case 3:
                x = 31;
                y = "March";
                break;
            case 4:
                x = 30;
                y = "April";
                break;
            case 5:
                x = 31;
                y = "May";
            case 6:
                x = 30;
                y = "June";
                break;
            case 7:
                x = 31;
                y = "july";
                break;
            case 8:
                x = 30;
                y = "Auguest";
                break;
            case 9:
                x = 31;
                y = "sep";
                break;
            case 10:
                x = 30;
                y = "oct";
                break;
            case 11:
                x = 31;
                y = "november";
                break;
            case 12:
                x = 30;
                y = "December";
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        System.out.println(y+" "+year+" has "+x+" days\n");
        sc.close();
    }
}