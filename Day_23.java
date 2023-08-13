// program to Replace all 0’s with 1 in a given integer

package Simple;
import java.util.Scanner;
public class Day_23 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int i=0;
        while(num>0)
        {
            int reminder=num%10;
            if(reminder==0)
                reminder=1;
            num=num/10;
            i=i*10+reminder; //i will print the result in reverse order
        }
        num=0;
        while(i>0)
        {
            int rev=i%10;
            num=num*10+rev;
            i=i/10;
        }
        System.out.println("New number is "+num);
    }
}
