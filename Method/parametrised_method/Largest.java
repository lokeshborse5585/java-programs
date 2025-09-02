//Write a program with a method that takes  numbers and returns the largest among them.
import java.util.Scanner;
class  Largest 
{
	public static void main(String[] args) 
	{
		System.out.println("Write a program with a method that takes  numbers and returns the largest among them.");
		Scanner ch=new  Scanner (System.in);
		System.out.println("Enterb the number");
		long  num=ch.nextInt();
		System.out.println("the largest  digit from the  number:" +num+ " is  = " +large(num));
	}
	public static long large(long n)
	{  long largest=0;
		
		while(n>0)
		{ 
			long a=n%10;//give a last number
		   //we write the  logic for the  ckeking largest
		      if(a>largest)
			{
				largest=a;  
			}
		   
			n=n/10; 
			
			
		
			
		}
		return largest;
	}
}
