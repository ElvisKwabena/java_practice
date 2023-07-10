import java.lang.*;
import java.util.Scanner;

class cuboid
{
	public static void main(String args[])
	{
	int length,breadth,height;
	double volume,total_area;
	System.out.println("Please enter the parameters");
	Scanner sc=new Scanner(System.in);
	length=sc.nextInt();
	breadth=sc.nextInt();
	height=sc.nextInt();
	volume=length*breadth*height;
	total_area=2*(length*breadth+length*height+height*breadth);
	System.out.println("Volume is " + volume + " and Total Area is " + total_area);
        }
}