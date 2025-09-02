
import java.util.Scanner;
class Factorial

 
{
	public static void main(String[] args) 
	{   Scanner ch=new Scanner(System.in);
		System.out.println("welcome in factorial program by using thr method reccurtion");
		System.out.println("Enter the number :");
		long num=ch.nextLong();
		System.out.println("The factorial of "+num+" is "  +fact(num));
		System.out.println("your program are succesfully run")	;
	}
	public static long fact(long n)
	{  
		if(n==0)
		{
			return 1;
			
		}	
	    return n*fact(n-1);
		
	}
}
