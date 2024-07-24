import java.util.*;
public class second {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int r = sc.nextInt();
                if((r%4==0 && r%100!=0) || (r%400==0))
                {
                    System.out.println(r+" is a leap year");
                }
                else
                {
                    System.out.println(r+" it is not a leap year");
                }
            }
        }
