package practice;

import java.io.*;
import java.util.*;

public class color {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1= "RED";
        String s2= "BLUE";
        if(s.equals(s1))
        {
            System.out.println("The Chromatic Horizon reveals: It is Dusk");
        }
        else if(s.!equals(s2))
        {
          System.out.println("The Chromatic Horizon reveals: It is Dawn");  
        }
        else
        {
            System.out.println("The Chromatic Riddle unfolds: Invalid Input");
        }
    }
}