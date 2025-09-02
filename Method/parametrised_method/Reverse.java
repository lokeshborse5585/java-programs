//Java program to print a number in reverse using the method
import java.util.Scanner;
class Reverse 
{
	public static void main(String[] args) 
	{
		System.out.println(" Java program to print a number in reverse using the method");
		Scanner ch=new Scanner(System.in);
		long num=ch.nextInt();
		System.out.println("the  reverse of the number:" +num+ " is " +reverse(num));
	}
	public static long reverse(long n)//147
	{ long temp=0;
	 //n=147 //14   //1  //0   ===== condition false
		while(n>0)
    	{              
		 long  a=n%10;  //7 //4 //1
		 temp=temp*10+a; //0*10=0+7=7   temp=7  //7*10=70+4=74   temp=74  //74*10=740+1=741
		  
		 n=n/10;       //14 //1  //0
		  
		
	   }
	   return temp;  //741
		
	}
}

/* E:\Java\Method\parametrised_method>javac Reverse.java

E:\Java\Method\parametrised_method>java Reverse
 Java program to print a number in reverse using the method
57846543
the  reverse of the number:57846543 is 34564875
 */
