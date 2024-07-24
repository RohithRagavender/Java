import java.util.*;
public class harshard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        int temp = n;
        int sum=0;
        while (n!=0) {
            int rem =n%10;
            sum=sum+rem;
            n=n/10;
        }   
        if(temp%sum==0)
        {
            System.out.println("Harshad  Number");
        }
        else
        {
            System.out.println("Not a harshad");
        }
        sc.close();
    }
}
