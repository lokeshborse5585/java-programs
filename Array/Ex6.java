// store  the random  values and print the only odd value  from thye aary object
import java.util.Scanner;
class Ex6
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
		System.out.println("acess the  odd element from the arry ");
		for (int i=0;i<size;i++ )
		{
			
			//condition to store the odd  element 
			if (pi[i]%2!=0)
			{
				System.out.println(pi[i]);
			}
			
		}
		
	}
}
/* 
E:\Java\Array>javac Ex6.java

E:\Java\Array>java Ex6
Enter the size of that aary object
5
7
8
9
4
6
acess the  odd element from the arry
7
9
 */
