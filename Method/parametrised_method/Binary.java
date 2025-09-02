//print binary manually
import java.util.Scanner;
class  Binary  
{
	public static void main(String[] args) 
	{    
		System.out.println("print binary manually");
		Scanner ch=new Scanner(System.in);
		long num=ch.nextInt();
		System.out.println("the binary of :" +num+ " is " +binary(num));
	}
		public static String binary(long a)
	{       
		
			String binary="";
			while(a>0)
			{
				long rem=a%2;
				binary=rem+binary;	
				a=a/2;
			}
			return binary;
		
	}
}
