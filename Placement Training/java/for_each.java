import java.util.*;
public class for_each {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("String lowercase is given");
        System.out.println("*****************");
        System.out.println("Enter the UpperCase String");
        String a = sc. next();
        String str ="Madam";
        System.out.println("The given word is :"+str);
        int count=0;
        for(char i : a.toCharArray())
        {
            System.out.print(i+" \n");
            count++;
        }

        System.out.println("The Length of the letter is: "+(count-1)); // length kandupudikirathuku without builtin function

        System.out.println("Now we want to change into Lowercase");
        for(int i=0;i<=count-1;i++)
        {
            System.out.print((char)(a.charAt(i)+32)); // +32 UPPER TO LOWER AND -32 LOWER TO UPPER
        }
        System.out.println("\n");


        // types of qn 1.check uppercase or 2.check lowercase 3.alphanumeric word 
        int lower=0;
        for(int i=0;i<count;i++)
        {
            char ch = a.charAt(i);
            if(ch>='0'&&ch<='9'||ch>='A' && ch<='Z'||ch>='a'&&ch<='z')
            {
                lower++;
                 if(lower==count)
                 {
                    System.out.println("The words are  lower case");
                 }
            }
            else
            {
                System.out.println("The words are not alphanumeric case");
            }
        }
     }
}