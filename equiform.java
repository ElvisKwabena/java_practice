import java.lang.*;
import java.util.Scanner;


class equiform 
{
	public static void main(String args[])
	{
		int a,b,c;
		double s;
		double aroot;
		System.out.println("Please enter the three sides: ");
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		s= (a+b+c)*0.5;
		aroot= s*(s-a)*(s-b)*(s-c);
		System.out.println("The area is : " + Math.sqrt(aroot));
	}
}