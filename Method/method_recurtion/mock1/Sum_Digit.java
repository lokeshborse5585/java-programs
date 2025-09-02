import java.util.Scanner;
class Sum_Digit 
{
	public static void main(String[] args) 
	{   Scanner ch=new Scanner(System.in);
		System.out.println(" welcome in program");
		System.out.println("Enter the number");
		long num=ch.nextLong();
	    System.out.println("the sum of number : "  +num+  " is " +sum_digit(num));
		
	}
	public  static long sum_digit(long n)//124
	{
		 if(n==0)
		{
		 return n;
		}
		return (n%10)+sum_digit(n/10);
		  /*sumDigits(1234)
   = 4 + sumDigits(123)
     = 4 + (3 + sumDigits(12))
    = 4 + (3 + (2 + sumDigits(1)))
    = 4 + (3 + (2 + (1 + sumDigits(0))))
      = 4 + 3 + 2 + 1
     = 10 */
	}
}
