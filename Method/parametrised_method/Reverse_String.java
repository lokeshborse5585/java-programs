//Write a program with a method that accepts a string and returns the string in reverse and chek the string are palindrom are not
import java.util.Scanner;
class Reverse_String 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Write a program with a method that accepts a string and returns the string in reverse.");
		System.out.println("Enter the string");
		Scanner ch=new Scanner(System.in);
	    String input=ch.next();
		    System.out.println("THE INPUT STRING IS : "+input );
			System.out.println("THE REVERSE STRING IS : " +reverse(input));
			
			//if(input==reverse(input))
				//In Java, == checks object reference equality for strings, not the actual text. So even if the strings have the same characters, this will often fail.

               //✅ Solution: Use .equals() to compare the content of strings.
			   if(input.equals(reverse(input)))
		{ 
				System.out.println("the given string are  the  palindrom");
				
				
		}
		else
		{
		System.out.println("the given string are not the  palindrom");
		}
			System.out.println("your program is running is sucessfully");
		  
	}
	public static  String reverse(String a)
	{
		//first we requred the length of ghe string 
		String output="";
		//int n=a.length();//string index start from the zero//this give the outof bonf exception
		//lokesh
		int n=a.length()-1;//6-1=5
		while(n>=0)//true//true//true//true//true
		{   
			output=output+a.charAt(n);//hseko
			n--;//4//3//2//1//0
		}
		return output;
	}
	
}
/* Write a program with a method that accepts a string and returns the string in reverse.
Enter the string
aba
THE INPUT STRING IS : aba
THE REVERSE STRING IS : aba
the given string are  the  palindrom
your program is running is sucessfully   */