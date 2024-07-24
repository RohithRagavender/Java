import java.util.*;
public class for_using {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        for(;;)
        {
            if(i<=n)
            {
                if(i>=2 && i<=99)
                {
                    if(i%2==0)
                    {
                        System.err.println("The Even numbers are :"+i);
                    }
                }
            }
            else
            {
                break;
            }
               i++;
        }
        sc.close();
    }
}
