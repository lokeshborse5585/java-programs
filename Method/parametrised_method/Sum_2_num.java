// Write a program to create a method that takes two integers as parameters and returns their sum.
import java.util.Scanner;
class  Sum_2_num
{
 public static void main(String[] args) 
	{
		System.out.println(" Write a program to create a method that takes two integers as parameters and returns their sum");
		//object Scanner class
		Scanner ch=new Scanner(System.in);
		System.out.println("Enter the num 1:");
		
		int num1=ch.nextInt();//num 1
		System.out.println("Enter the num 2:");
		int num2=ch.nextInt();//num2
		//call  the method with actual argument
		System.out.println("the sum of the  two  integer number is :" +sum(num1,num2));
		
	}
public  static int sum(int a,int b)
	{  
	   return a+b;
	}
}
