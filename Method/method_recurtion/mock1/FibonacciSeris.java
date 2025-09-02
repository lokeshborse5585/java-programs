import java.util.Scanner;
class FibonacciSeris

  
{
	public static void main(String[] args) 
	{
		System.out.println(" welcomer in program");
		 Scanner ch=new Scanner(System.in);
		 long num=ch.nextLong();
		  for (int i=0;i<=num ;i++ )
		  { 
			 System.out.print( fibonacci(i) + " " ) ;
		  }
		
	}
	    public static long fibonacci(long n)
	{
			if (n<=1)
			{
				return n;
			}
			return fibonacci(n-1) + fibonacci(n-2);
	}
}
