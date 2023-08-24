//Write a program to find the double of the given number without using arithmetic operator

package Simple;

import java.util.Scanner;

public class Day_27 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=sc.nextInt();

        //this is bit wise left shift operators
        System.out.println("Double of the given number without using arithmetic operator is: "+(num<<1));
    }
}
