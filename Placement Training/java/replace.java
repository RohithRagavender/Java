import java.util.*;
public class replace {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String s= sc.nextLine();
        String f ="Rohiths";
        f=s.replaceAll("\\s","");
        System.out.println(f);
        sc.close();
        }
    }

