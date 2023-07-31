// Write a program to Add two fractions

package Simple;

import java.util.Scanner;

public class Day_18 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();

        double result1=(a*d)+(c*b);
        double result2=(b*d);

        System.out.println("Addation is : "+(result1/result2));
        
    }
    
}
