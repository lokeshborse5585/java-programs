import java.util.Scanner;
class Palindrom 
{
	public static void main(String[] args) 
	{    Scanner ch=new Scanner(System.in);
		System.out.println("Enter the input string");
		String input=ch.next();
		System.out.println("The input String is :"+input);
		System.out.println("The string is :" +pal(input));
	}
	
	 public static String pal(String a)
	{ 
		 a = a.toLowerCase();//convert to lowercase (ignores case)
		 if(a.charAt(0)==a.charAt(a.length()-1))
		{
			 return "palindrom";
		}
		return "not palindrom";
		 
		 
	}
}
