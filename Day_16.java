// number is Perfect number or not
package Simple;

import java.util.Scanner;

public class Day_16 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<num;i++)
        {
            if (num%i==0)
            {
                sum=sum+i;
            } 
        }
        if(sum==num)
            {
                System.out.println("Perfect Number");
            }
            else
            {
                System.out.println("Not Perfect Number");
            }
    }
}
