//Write a program with a method that prints the square of a fixed number.
import java.util.Scanner;
class Square 
{
	public static void main(String[] args) 
	{   //scanner class object
		Scanner ch=new Scanner(System.in);
		int num=ch.nextInt();
		System.out.println("Write a program with a method that prints the square of a fixed number.");
		//call method
	     System.out.println( "THE SQUARE OF " +num+"  IS  " +Square(num));//print the output
		 
	}
	
	
	public static long Square(long num)
                
	{
		long result=num*num;
		return  result;
		
	}
	
	
	
	
}
