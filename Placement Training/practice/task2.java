package practice;
 import java.util.*;
      public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First String");
        String s1 = sc.next();
        int s= (int)(s1.charAt(0));
        System.out.println("Enter the Second String");
        String s2=  sc.next();
        int c= (int)(s2.charAt(0));
        System.out.println("Result the String value");
        int res = s+c;
        System.out.println("The Result value is:"+res);
    }
}
