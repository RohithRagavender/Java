import java.util.*;
public class sumofnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int n = sc.nextInt();
        int sum=0;
        while (n!=0) {
            int rem =n%10;
            sum+=rem;
            n=n/10;
        }
        System.out.println("The sum of Digit "+sum);
        sc.close();
    }
}
