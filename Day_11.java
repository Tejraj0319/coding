package Simple;

import java.util.Scanner;

public class Day_11 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int num;
        int a=0,b=1;
        System.out.println("Enter the num: ");
        num=sc.nextInt();
        System.out .println(+a);
        System.out .println(+b);
        for(int i=2;i<=num;i++)
        {
            int c=a+b;
            a=b;
            b=c;  
            System.out .println(c);
        }
    }    
}

