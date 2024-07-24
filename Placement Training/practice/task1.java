package practice;
import java.util.*;
public class task1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String:");
    String h = sc.nextLine();
    int length=0;
    for(char c:h.toCharArray())
    {
        length++;
    }
    String a =h.replaceAll("//s","");
    for(int i=0;i<=length-1;i++)
    {
        char sr = h.charAt(i);
         if(sr>='a' && sr<='z')
         {
            System.out.print((char)(h.charAt(i)-32));
         }
         else if(sr>='A' && sr<='Z')
         {
            System.out.print((char)(h.charAt(i)+32));
         }    
    }
    sc.close();
}    
}
