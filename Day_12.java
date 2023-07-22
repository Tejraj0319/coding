

package Simple;

import java.util.Scanner;

public class Day_12
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int num;
        System.out.println("Enter the num: ");
        num=sc.nextInt();
       // for(int i=num;i!=0;i++)
       while(num>0)
        {
            sum=sum+num%10;
            num=num/10;  
        }  
        System.out.println("Sum of the Digits is: "+sum);     
    }
}
