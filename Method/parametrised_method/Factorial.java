//Write a program to calculate the factorial of a number using a parameterized method.
import java.util.Scanner;
class Factorial
  
{
	public static void main(String[] args) 
	{
		System.out.println("  Write a program to calculate the factorial of a number using a parameterized method.");
		System.out.println("Enter the number");
		Scanner ch=new Scanner(System.in);
		long num=ch.nextInt();
		System.out.println("The factorial of the " +num+ " is " +fact(num));
	}
		public static  long fact(long n)
	{   
			long fact1=1;
		    //n=5
			while (n>=1)//t//t//t//t//t//false
			{    
				fact1=fact1*n;//5//20//60//120//120
				n--; //4//3//2//1//0
			}
				return fact1;
	}
}
