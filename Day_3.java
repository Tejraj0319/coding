package Simple;

import java.util.Scanner;

class Day_3
{
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the character : ");
            char c=sc.next().charAt(0);
            int i=c;
            System.out.println("The ASCII value of inserted character is: "+i);
        }
    }
}
