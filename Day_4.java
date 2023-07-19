package Simple;

import java.util.Scanner;

public class Day_4 
{
    public static void main(String args[])
    {
        int num;
        try(Scanner sc=new Scanner(System.in);){
        System.out.println("Enter the number : ");
        num =sc.nextInt();
        }
        if (num>0)
        {
            System.out.println(num+ " is Positive ");
        }
        else if(num==0)
        {
            System.out.println(num+ " is Zero ");
        }
        else
        {
            System.out.println(num+ " is Negative");
        }
    }
}
