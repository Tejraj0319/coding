package Simple;

import java.util.Scanner;

public class Day_1 
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            System.out.println("Enter the Chara : ");
            char c=sc.next().charAt(0);
        
            if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'|| c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            {
                System.out.println("the chara is vowel");
            }
            else if ((c>='A'&& c<='Z')||(c>='a'&&c<='z'))
            {
                System.out.println("Chara is consonant");
            }
            else
            {
                System.out.println("Invalid input");     
            }
        }
    }   
}
