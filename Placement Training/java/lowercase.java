import java.util.*;
public class lowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        String s1 = s.toUpperCase(null)
        int length=0;
        for(char c:s.toCharArray())
        {
            length++;
        }
        System.out.println("The words of the length is: "+length);
        System.out.println("The word is:"+s);
        int count=0;
        for(int i=0;i<=length-1;i++)
        {
            char r =s.charAt(i);
            if(r>='a' && r<='z')
            { 
                count++;
            }
        }
        if(length==count)
                {
                    System.out.println("The given word is lowercase");
                }
                else
                {
                    System.out.println("The give word is not lowercase");
                }
                sc.close();
            }
        }

