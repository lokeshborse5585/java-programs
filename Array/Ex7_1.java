//identityfy the sum of the  arry element

import java.util.Scanner;
class Ex7_1
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
		System.out.println("Enter the element in arry object");
		int sum=0;
		for (int i=0;i<size ; i++ )
		{
			arr[i]=ch.nextInt();
			sum=sum+arr[i];
		}
		//acess the element 
		/*int sum=0;
		for (int i=0;i<size;i++ )
		{
			//store the  sum  of aal the element present in the arry object
			sum=sum+arr[i];
			//sum+=arr[i];
			
		}*/
		System.out.println("the sum of the arry element : " +sum);
	}
}