//Sum of Digits Using Recursion
import java.util.Scanner;
class  SumDigits
{
	public static void main(String[] args) 
	{   Scanner ch=new Scanner(System.in);
	    long a=ch.nextInt();
		System.out.println("main start");
		System.out.println(sumDigits(a));//passinf the variavle which want to find the factorial of that number
		 System.out.println("main end");
	}
	public static  long  sumDigits(long a)
	{        if (a==0)//base case condition
		{
			 return 0;//becuse we konw last multiple in any factorial is the 1 number
		} 
		  
			 
			   return (a % 10) + sumDigits(a/ 10);
	}
}
