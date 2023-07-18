package Simple;

import java.util.Scanner;

public class Day_2 
{
     public static void main(String[] args) 
    {
        try(Scanner sc=new Scanner (System.in);)
        {
            System.out.println("Enter the chara: ");
            char c=sc.next().charAt(0);

            if((c>='A'&&c<='Z')||(c>='a'&&c>='z'))
            {
                System.out.println("Chara is Alphabet");
            }
            else
            {
                System.out.println("Chara is Not an alphaet");
            }
        }
    }  
}
