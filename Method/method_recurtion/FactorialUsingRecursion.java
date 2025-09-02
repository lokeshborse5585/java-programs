
import java.util.Scanner;
class  FactorialUsingRecursion
{
	public static void main(String[] args) 
	{   Scanner ch=new Scanner(System.in);
	    int a=ch.nextInt();
		System.out.println("main start");
		System.out.println(fact(a));//passinf the variavle which want to find the factorial of that number
		 System.out.println("main end");
	}
	public static  int  fact(int a)
	{        if (a==1)//base case condition
		{
			 return 1;//becuse we konw last multiple in any factorial is the 1 number
		}
			 
			   return a*fact(a-1);
	}
}
