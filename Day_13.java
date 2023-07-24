package Simple;

import java.util.Scanner;

public class Day_13 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        int sum=0;
        System.out.println("Enter the value no: ");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++)
            sum=sum+i;
        System.out.println("Sum is: "+sum);
    }
}
