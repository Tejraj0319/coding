//write a program to reverse the given number

package Simple;

import java.util.Scanner;

public class Day_14 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        int rev=0;
        int num;
        System.out.print("Enter a number: ");
        num=sc.nextInt();

        while(num>0)
        {
            rev=(rev*10)+num%10;
            num=num/10;
        }
        System.out.println("Reverse of the given no is: "+rev);
    }
    
}
