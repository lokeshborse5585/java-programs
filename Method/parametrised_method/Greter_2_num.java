//Write a program with a method that takes two integers and returns the greater number.
import java.util.Scanner;
class Greter_2_num 
{
	public static void main(String[] args) 
  {
		System.out.println("Write a program with a method that takes two integers and returns the greater number.");
		//Scanner object
		Scanner ch=new Scanner(System.in);
		System.out.println("Enter the num1");
		int num1=ch.nextInt();
		System.out.println("Enter the num2");
		int num2=ch.nextInt();
	    System.out.println("the largest number from :" +num1+ " and : " +num2+ "is " +large(num1,num2));
  }
	public static  int large(int a,int b)
 {
		
		if (a>b)
		{    
			return  a;
		}
		if (a<b)
		{    
			return  b;
		}
		System.out.println("both the number is the same");
		return a;
		
	
	

	 
  }
  
}
