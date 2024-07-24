import java.util.*;
public class equal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        int length=0;
        for(char x:s.toCharArray())
        {
            System.out.println(x);
            length++;
        }

// plaindrome concept
        String r="";
        for(int i=length-1;i>=0;i--)
        {
            r=r+s.charAt(i);
        }
        System.out.println("The reverese of the string: "+r);
        if(s.contains(r))
        {
            System.out.println("Both are equal");
        }
        else
        {
            System.out.println("Both are not equal");
       }
        sc.close();
    }
}
