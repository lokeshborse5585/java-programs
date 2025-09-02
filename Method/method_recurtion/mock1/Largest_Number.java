import java.util.Scanner;
class  Largest_Number
{
	public static void main(String[] args) 
	{  Scanner ch=new Scanner(System.in);
	   
		System.out.println("Enter the num 1");
		long num1=ch.nextLong();
		
		System.out.println("the largest number is: " +largest(num1));
	}
	public static long largest(long a)
	{
		 if(a==0)
		{
			 return a;
		}
		 long lastnum=a%10;
		  long maxnum=largest(a/10);
		 
		 if(lastnum>maxnum)
		{
			 return lastnum;
		}
		else
		{
			return maxnum;
		}
		
	}
}
