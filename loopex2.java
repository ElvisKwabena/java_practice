import java.lang.*;
import java.util.Scanner;

class loopex2
{
    public static void main(String[] args)
   

    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter  a number:");
        int n=sc.nextInt();
        int sum=0;
        
        for(int i=1;i<n+1;i=i+1)
        {
            sum=sum+i;
            System.out.println(sum);
        }
    }


}