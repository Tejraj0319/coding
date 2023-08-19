//Write a program to find Area of a circle

package Simple;

import java.util.Scanner;

public class Day_25 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radious of the circle: ");
        float r=sc.nextFloat();
        double area=(3.14*r*r);
        System.out.println("Area of circle is : "+area);
        
    }
}
