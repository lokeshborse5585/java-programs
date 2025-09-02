import java.util.Scanner;
class Swaping 
{
	public static void main(String[] args) 
	{    Scanner ch=new Scanner(System.in);
		System.out.println("Enter the size of the arry object");
	   
		// making the object
		//int[] arr=new int[size];
		int a=10;
		int b=20;
		System.out.println(" method 1 : addition and division");
		System.out.println(" before Swapping");
		System.out.println("a : " +a);
		System.out.println("b : " +b);
		a=a+b;//10+20=30
		b=a-b;//30-20=10
		a=a-b;//30-20=10
		
		System.out.println("after the swpaing " );
		
		System.out.println("a : " +a);
		System.out.println("b : " +b);
		
		
		System.out.println(" method 2 : multiplucation and division");
		int c=5;
		int d=4;
		System.out.println(" before Swapping");
		System.out.println("c : " +c);
		System.out.println("d : " +d);
		 a=a*b;//c*d=20
		 b=a/b;
		 a=a/b;
		 System.out.println("after the swpaing " );
		
		System.out.println("c : " +c);
		System.out.println("d : " +d);
		
		System.out.println(" x_or oprrtaer");
		int e=5;
		int f=8;
		System.out.println(" before Swapping");
		System.out.println("e : " +e);
		System.out.println("f : " +f);
		 e=e^f;//c*d=20
		 f=e^f;
		 e=e^f;
		 System.out.println("after the swpaing " );
		
		System.out.println("e: " +e);
		System.out.println("f : " +f);
		 
		
		
	}
}
