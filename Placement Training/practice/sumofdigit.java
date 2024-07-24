package practice;
import java.util.*;
public class sumofdigit {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num= sc.nextInt();
        int sum=0;
        while (num!=0) {
            int res=num%10;
            sum=sum+res;
            num=num/10;
        };
        System.out.println("The sum of the digit is : "+sum);     
        sc.close(); 
    }
}
