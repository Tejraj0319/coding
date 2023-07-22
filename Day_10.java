
package Simple;

import java.util.Scanner;

public class Day_10 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in); 
        int num, fact=1;
        System.out.println("Enter the number:  ");
        num =sc.nextInt();
        for(int i = 1;i<=num;i++)// i++ will  increment the value of the i upto num
        {
            fact=fact*i;
            System.out.println(fact);
        }
    }
}

