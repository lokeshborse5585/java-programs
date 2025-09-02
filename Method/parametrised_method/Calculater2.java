import java.util.Scanner;
class Calculater2
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
			    int res= add(a,b);
				
				System.out.println("THE ADDITION OF GIVEN 2 NUMBER IS :" +res);
				   break;
			}
			   case 2:
			{ 
			     int res=sub(a,b);
				
				System.out.println("THE substraction OF GIVEN 2 NUMBER IS :" +sub( a,b));
				   break;
			}
			   case 3:
			{ 
			    int res= mul(a,b);
				
				System.out.println("THE multiplication  OF GIVEN 2 NUMBER IS :" +res);
			   break;
			}
			   case 4:
			{ 
			   int res= div(a,b);
				
				System.out.println("THE division OF GIVEN 2 NUMBER IS :" +res);
			   break;
			}
			   case 5:
			{ 
			    int res=mod(a,b);
				
				System.out.println("THE modulas OF GIVEN 2 NUMBER IS :" +res);
			   break;
			}
		
		}
	}
		  public  static  int add(int a, int b)
		{
			int res=a+b;
			
			return res;
		}
		 
          public  static int sub( int a, int b)
		{
			int res=a-b;
			
			return res;
		}
		  
		   public static  int mul( int a,int b)
		{
			int res=a*b;
		
			return res;
		}
		  
           public  static int div(int a, int b)
		{
			int res=a/b;
			
			return res;
		}
			
		  public static  int mod(int a, int b)
		{
			int res=a%b;
			
			return res;
		}
		  
		  
		  
			
		

		
		
	
}
