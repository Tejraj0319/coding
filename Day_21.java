//Palindrome num

package Simple;

import java.util.Scanner;

public class Day_21 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no: ");
        int num=sc.nextInt();
        int copy=num;
        int rem,rev=0;

        while(num!=0)
        {
            rem=num%10;
            rev=rev * 10 +rem;
            num=num/10;
        }
        if(rev==copy)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("No");
        }
    }
    
}


