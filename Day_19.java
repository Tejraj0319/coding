//Armstrong number

package Simple;

import java.util.Scanner;

public class Day_19
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int i=num;
        int sum=0;
        while(i>0)
        {
            int a=(i%10);
            sum=sum+a*a*a;
            i=i/10;
        }
        if (sum==num)
        {
            System.out.println("Armstrong number");
        }
        else
        {
            System.out.println("not Armstrong number");
        }

    }
}
