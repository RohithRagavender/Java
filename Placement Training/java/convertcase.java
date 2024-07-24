import java.util.*;
public class convertcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        int length=0;
        for(char c: s.toCharArray())
        {
            length++;
        }
        int count=0;
        for(int i=0;i<=length-1;i++)
        {
            System.out.print((char)(s.charAt(i)+32)); // -32 LOWER TO UPPER  //32 UPPER TO LOWER
        }
        sc.close();
    }
}
