import java.util.Scanner;
class Calculater
{
	public static void main(String[] args) 
	{  Scanner ch=new Scanner(System.in);
		System.out.println("wellcome in calculater");
		System.out.println("ENTER THE 1 FOR THE ADDITION");
		System.out.println("ENTER THE 2 FOR THE SUBSTARCTION");
		System.out.println("ENTER THE 3 FOR THE MULTIPLICATION");
		System.out.println("ENTER THE 4 FOR THE DIVISION");	
		System.out.println("ENTER THE 5 FOR THE MODULAS");
			int input=ch.nextInt();
		System.out.println("ENTER THE first number:");
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
