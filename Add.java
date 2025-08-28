import java.util.Scanner;
class Add
{
	public static void main(String[] args) 
	{
		Scanner ch=new Scanner(System.in);
			int num=ch.nextInt();
		
		int rem=0;
		int sum=0;
		while(num>=0)
		{
		  rem=num%2;
		  sum=sum+rem;
		  num=num/10;
		}
		System.out.println( " The sum of the given number is :" +sum);
	}
}

