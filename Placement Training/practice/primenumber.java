package practice;
import java.util.*;
public class primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number: ");
        int n = sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
            if(count==2)
            {
                System.out.println("Prime Number");
            }
            else
            {
                System.out.println("Not Prime Number");
            }
        sc.close();
    }
}
