// give the size from the user and strore tha valve and assc it
import java.util.Scanner;
class Ex2 
{
	public static void main(String[] args) 
	{  //creating the Scanner class object
		Scanner ch=new Scanner(System.in);
		
		System.out.println("Enter the size of that aary object");
		int size=ch.nextInt();
		//creating the aary object
		int[] pi=new int[size];
		//store the element
		for (int i=0;i<size ;i++ )
		{
			pi[i]=ch.nextInt();
		}
		//acess the element from the arry 
		System.out.println("acess the element from the arry ");
		for (int i=0;i<size;i++ )
		{
			System.out.println(pi[i]);
		}
		
	}
}
