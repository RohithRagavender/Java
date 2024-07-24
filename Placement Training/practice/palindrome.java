package practice;
//palindrome nah 121 equal 121 epdi nah reverse pana atha value varum apdi vantha atha palindrome
import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int sum=0;
        int temp=n;
        while (n!=0) {
            int rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        if(sum==temp)
        {
            System.out.println("palindrome number");
        }
        else 
        {
            System.out.println("Not palindrome number");
        }
        sc.close();
    }
}
