//identityfy the sum of the evven index element
import java.util.Scanner;
class Ex8
{
	public static void main(String [] prr)
	{   //pbject of scanner class
		Scanner ch=new Scanner(System.in);
		//stroe the  size of the  arry object
		System.out.println("Enter the size of the object");
		int size=ch.nextInt();
		//creting the aary object
		int[] arr=new int[size];
		//store the element
		System.out.println("input");
		System.out.println("Enter the element in arry object");
		int sum=0;
		for (int i=0;i<size ; i++ )
		{
			arr[i]=ch.nextInt();//storing the element
			if (i%2==0)
			{
				sum=sum+arr[i];
			}
			
		}
		System.out.println("the sum of the  eeven index arry element : " +sum);
		System.out.println("the following element store in the arry object: " );
		for (int i=0;i<size;i++ )
		{
			System.out.println(arr[i]);
		}
		 
		
		
	}
}
/*
E:\Java\Array>java Ex8
Enter the size of the object
5
input
Enter the element in arry object
1
2
3
4
5
the sum of the  eeven index arry element : 9
the following element store in the arry object:
1
2
3
4
5 
*/