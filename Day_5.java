package Simple;

import java.util.Scanner;

class Day_5
{
    public static void main (String arges[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number: ");
            int num=sc.nextInt();
            String value=num%2==0?"The "+num+" is Even number nu":"The "+num+" is Odd number";
            System.out.println(value);
        }
    }
}

