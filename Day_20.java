//Prime number

package Simple;

import java.util.Scanner;

public class Day_20 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        boolean flag= false;

        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                flag=true;
                break;
            }
        }
        if(!flag)
        {
            System.out.println(num+" is Prime number");
        }
        else
        {
            System.out.println(num+" is not Prime number");
        }
    }
}
