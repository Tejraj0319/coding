package Simple;

import java.util.Scanner;

public class Day_6 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        int x=sc.nextInt();
        System.out.println("Enter the value of y: ");
        int y =sc.nextInt();
        if(x>0 && y>0)
        {
            System.out.println("This point lies in the first quadrant.");
        }
        else if(x<0 && y>0)
        {
            System.out.println("This point lies in the Second quadrant.");
        }
        else if(x<0 && y<0)
        {
            System.out.println("This point lies in the third quadrant.");
        }
        else if(x>0 && y<0)
        {
            System.out.println("This point lies in the forth quadrant.");
        }
        else
        {
            System.out.println("This point lies in origin.");
        }
    }
}
