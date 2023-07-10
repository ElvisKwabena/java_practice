import java.lang.*;
import java.util.Scanner;

class cond2
{
    public static void main(String[] args)
    {
        int a=12;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please how old are you? ");
        a=sc.nextInt();

        if(a>14 && a<45)
        {  
        System.out.println("You are young");
        }
        else 
        {
            System.out.println("You are old or too young");
        }
    }

}