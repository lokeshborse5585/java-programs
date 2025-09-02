import java.util.Scanner;
class  Ex4
{
	public static void main(String[] args) 
	{
		Scanner Scan = new Scanner(System.in);
		// take size of arry from user
		System.out.println("Enter Array Size");
		int Size = Scan.nextInt();
		int [] arr = new int [Size];
		int [] arr2 = new int [Size];
		// fstore the valuse in arr 1
		System.out.println("Enter Array  " + Size + " values");
		for (int i = 0; i < arr.length; i++ )
		{
			 arr[i] = Scan.nextInt() ;
		}
		//store the arr valuse in arr2
		System.out.println("Enter 2 Array  " + Size + " values");
		for (int i = 0; i < arr.length; i++ )
		{
			 arr2[i] = Scan.nextInt() ;
		}
		test ( arr,arr2);//POSIBLE TO PASS THE TWO  OR MORE OBJECT
	}
	public static void test ( int[] b , int... a) //WE  Hve to creat the 
	{
	   System.out.println("1 array PRINTING" );
	  for ( int i = 0; i < a.length ; i++ )
	  {
		  System.out.println(b[i]);
	  }
	   System.out.println("2 array PRINTING" );
	  for ( int i = 0; i < a.length ; i++ )
	  {
		  System.out.println(a[i]);
	  }
	
   }
}
/*
E:\Java\Method\variable_argument_method>java Ex4
Enter Array Size
5
Enter Array  5 values
1
4
7
8
9
Enter 2 Array  5 values
6
5
4
7
8
1 array PRINTING
1
4
7
8
9
2 array PRINTING
6
5
4
7
8   */