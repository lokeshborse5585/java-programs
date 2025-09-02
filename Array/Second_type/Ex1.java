import java.util.Scanner;
class Ex1 
{
	public static void main(String[] args) 
	{  // cretaing the arry object without using the new keyword
		// int[] arr;
		 //arr={12,23,42,12};//hera implisitrally new keyword her   //error
		 
		// int[] arr=new int[64,54,74];//error
		Scanner ch=new Scanner(System.in);
		//give a size of that objrct from the user 
		System.out.println("Enter the size of the  arry object");
		int size=ch.nextInt();
		
		System.out.println("Enter the element " +size );
		//ctrete the object of the arry
		int[] arr;
			arr=new int[size];
			 
         //for store  the element
		  for(int i=0;i<arr.length;i++)
		{
			arr[i]=ch.nextInt();
			  
	    	//System.out.println(arr[i]);
	    }
		//calling the element in the arry
		 for(int i=0;i<arr.length;i++)
		{
			//arr[i]=ch.nextInt();
			  
	    	System.out.println(arr[i]);
	    }
	}
}
