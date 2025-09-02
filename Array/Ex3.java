// store  the random  values and print the only evven index value  from thye aary object
import java.util.Scanner;
class Ex3
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
		System.out.println("acess the evven index element from the arry ");
		for (int i=0;i<size;i++ )
		{
			
			//condition to store the evven  index element 
			if (i%2==0)
			{
				System.out.println(pi[i]);
			}
			
		}
		
	}
}
/* /* 
E:\Java\Array>javac Ex3.java

E:\Java\Array>java Ex3
Enter the size of that aary object
5
8
7
9
6
2
acess the evven index element from the arry
8
9
2  */