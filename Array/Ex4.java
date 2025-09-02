// store  the random  values and print the only evven  value  from thye aary object
import java.util.Scanner;
class Ex4
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
		System.out.println("acess the  even element from the arry ");
		for (int i=0;i<size;i++ )
		{
			
			//condition to store the evven  element 
			if (pi[i]%2==0)
			{
				System.out.println(pi[i]);
			}
			
		}
		
	}
}
/*
Enter the size of that aary object
5
1
7
8
9
6
acess the element from the arry
8
6
*/