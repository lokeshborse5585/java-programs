//passing the address only  in the method as the actual variable
import java.util.Scanner;
class  Ex2
{
	public static void main(String[] args) 
	{  Scanner ch=new Scanner(System.in);	
		int size=ch.nextInt();
		//arry object
		int[] arr=new int[size];
	    for (int i=0;i<size ;i++ )
	    {
			arr[i]=ch.nextInt();
	    }

	   add(arr);
	   
	}
	//public static void  add(datatyape... refrenace_variable)
	public static void add(int... h) {
		    ///for acessing the element
			int sum=0;
			for(int i=0 ;i<h.length;i++ )
			{
				sum+=h[i];
			}
			System.out.println("the sum of the " +h.length+"  number is " +sum);  
	}
}