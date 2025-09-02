import java.util.Scanner;
class Calculater
{
	public static void main(String[] args) 
	{  Scanner ch=new Scanner(System.in);
		String[] arr={"Addition", "Subtraction", "Multiplication", "Division", "Modulus"};
		for ( int i=0;i<arr.length ;i++ )
		{  
			System.out.println("Enter the  number : " +(i+1)+"  for " +arr[i]);
		}
			int input=ch.nextInt();
		System.out.println("ENTER THE  first  number:");
			int a=ch.nextInt();
			System.out.println("ENTER THE second number:");
			int b=ch.nextInt();
		switch (input)
		{
		       case 1:
			{ 
			    add(a,b);
				   break;
			}
			   case 2:
			{ 
			    sub(a,b);
				   break;
			}
			   case 3:
			{ 
			    mul(a,b);
			   break;
			}
			   case 4:
			{ 
			    div(a,b);
			   break;
			}
			   case 5:
			{ 
			    mod(a,b);
			   break;
			}
		
		}
	}
		  public  static  void add(int a, int b)
		{
			int res=a+b;
			System.out.println("THE ADDITION OF NUMBER IS:"+res);
		}
		 
          public  static void sub( int a, int b)
		{
			int res=a-b;
			System.out.println("THE SUBSTRACTION OF NUMBER IS:"+res);
		}
		  
		   public static  void mul( int a,int b)
		{
			int res=a*b;
			System.out.println("THE MULTIPLICATION OF NUMBER IS:"+res);
		}
		  
           public  static void div(int a, int b)
		{
			int res=a/b;
			System.out.println("THE DIVISION OF NUMBER IS:"+res);
		}
			
		  public static  void mod(int a, int b)
		{
			int res=a%b;
			System.out.println("THE MODULAS OF NUMBER IS:"+res);
		}
		  
		  
		  
			
		

		
		
	
}
