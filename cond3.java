import java.lang.*;
import java.util.Scanner;

class cond3
{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks for the English, Math and Science respectively");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        
        float grade=(a+b+c)/3f;

        if (grade>=80)       
        {
            System.out.println("You had an A");
        }
        else if(grade>=75 && grade<=79)
        {
            System.out.println("You had a B+");
        }
        else if(grade>=70 && grade<=74)
        {
            System.out.println("You had a B");
        }
        else if(grade>=40 && grade<69)
        {
            System.out.println("You had a C to E");
        }
        else if (grade<49)
        {
            System.out.println("You had an F");
        }
    }

}