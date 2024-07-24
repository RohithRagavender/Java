// A young man named d'Artagnan leaves home and travels to Paris to join the Musketeers of the guard. Although D'Artagnan is not able to join this elite corps immediately, he befriends the three most formidable musketeers of the age: Athos, Porthos and Aramis and gets involved in affairs of the state and court.
//  At that time, the cardinal was planning to dethrone the king, take the kingdom and remove the musketeers of the guard. Since the cardinal has spies mixed with the local public, d'Artagnan decides to send a message of his whereabouts to the three musketeers in a unique way. He gave a note to a boy which has the following message.
// "I am at the midpoint of the line joining the farmhouse next to the palace and the lighthouse."
// The three musketeers were puzzled. Can you help them find out the location of d'Artagnan? Given, the coordinates of the 2 places (x1,y1) and (x2,y2), write a program to find the location of d'Artagnan.
 
// INPUT FORMAT: 
// •	Input consists of 4 integers.
// •	The first integer corresponds to x1. The second integer corresponds to y1. The third and fourth integers correspond to x2 and y2 respectively.

// OUTPUT FORMAT:
// •	The output consists of two floating point numbers which correspond to the location of d'Artagnan. All floating point values displayed should be corrected to 1 decimal place.

// SAMPLE INPUT: 
// 2
// 4
// 10
// 15

// SAMPLE OUTPUT: 
// 6.0 9.5

import java.util.*;
public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First Value: ");
        int x1=sc.nextInt();
        System.out.println("Second Value: ");
        int x2=sc.nextInt();
        System.out.println("Third Value: ");
        int y1=sc.nextInt();
        System.out.println("Fourth Value: ");
        int y2=sc.nextInt();
        float res=(x1+y1)/2;       
        float res1=(float)(x2+y2)/2;
        System.out.println("The Median value:"+res);
        System.out.println("The Medain value:"+res1);
        sc.close();
    }
}
