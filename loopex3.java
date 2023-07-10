import java.lang.*;
import java.util.Scanner;

class loopex3
{
    public static void main(String[] args)
   

    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter  a number:");
        int n=sc.nextInt();
        int sum=1;
        
        for(int i=1;i<=n;i++)
        {
            sum=sum*i;
            System.out.println("Factorial is "+ sum);
        }
    }


}