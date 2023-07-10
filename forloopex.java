import java.lang.*;
import java.util.Scanner;

class forloopex
{
    public static void main(String[] args)
   

    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter  a number:");
        int n=sc.nextInt();
        
        for(int i=1;i<=10;i++)
        {
            System.out.println(n*i);
        }
    }


}