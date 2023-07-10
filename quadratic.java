import java.lang.*;
import java.util.Scanner;

class quadratic
{
	public static void main(String args[])
	{
		int a,b,c;
		double d,r1,r2;
		System.out.println("Please enter the coeff.");		
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=Math.sqrt(b*b-4*a*c);
		r1=(-b+d)/(2*a);
		r2=(-b-d)/(2*a);
		System.out.println("The roots are "+ r1 + " and " + r2);
	}
}
		
		
	
		