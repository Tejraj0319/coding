//Strong number code

package Simple;

import java.util.Scanner;

public class Day_15
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in); 
        int num;
        int sum=0;
        System.out.println("Enter the number: ");
        num=sc.nextInt();
        int n=num;
        while(num>0)
        {
            int digit=num%10;
            int fact=1;
            for(int i=1;i<=digit;i++)
                fact=fact*i;
            sum=sum+fact;
            num=num/10;
        }
        if(sum==n)
        {
            System.out.println("Strong no");
        }
        else
        {
            System.out.println("Not Strong no");
        }

    }
}
