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
	     System.out.println( "THE SQUARE OF " +num+"  IS  " +Square());//print the output
		 
	}
	//called method
   /*	public static void Square()//incompatible types: unexpected return value return  result;
                
	{
		int result=num*num;
		return  result;
		
	} */
	
	public static int Square()
                
	{
		int result=num*num;
		return  result;
		
	}
	/* Square.java:26: error: cannot find symbol
                int result=num*num;
                           ^
    symbol:   variable num
     location: class Square
    Square.java:26: error: cannot find symbol
                int result=num*num;
                               ^
    symbol:   variable num
    location: class Square
     2 errors */
	
	
	
	
}
