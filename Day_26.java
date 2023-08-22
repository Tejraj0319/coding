//Count the total no of Handshakes 

package Simple;

import java.util.Scanner;

public class Day_26 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total no of people: ");
        int n=sc.nextInt();
        int Handshakes=(n*(n-1))/2;
        System.out.println("Total no of Handshakes are : "+ Handshakes);

    }
}

