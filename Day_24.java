package Simple;

public class Day_24 {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            for(int x=2;x<=i;x++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
