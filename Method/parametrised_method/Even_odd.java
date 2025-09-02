//Write a program with a parameterized method to check whether a number is even or odd.
import java.util.Scanner;
class  Even_odd
{
	public static void main(String[] args) 
	{   Scanner ch=new Scanner(System.in);
	     System.out.println("Enter the num 1");
		 long num=ch.nextInt();
		System.out.println("the number :"+check(num));
	}
	public static  String check(long n)
	{
		 /*if (n^1==0)//remebar the every odd number having last number of the binary is the always  1
		{
			return n+"odd";
		}
		else
			sreturn n+"evven";   */
		if((n&1)==0)
		{
			return n+"even";
		}
		else
			return n+"odd";
		
		
	}
}
