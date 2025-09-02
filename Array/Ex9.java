//identityfy the  average of the element of the element present in an aary and also average of even element and  average odd element
import java.util.Scanner;
class Ex9
{
	public static void main(String [] prr)
	{   //object of scanner class
		Scanner ch=new Scanner(System.in);
		//stroe the  size of the  arry object
		System.out.println("Enter the size of the object");
		int size=ch.nextInt();
		//creting the aary object
		int[] arr=new int[size];
		//store the element
		System.out.println("input");
		System.out.println("Enter the element in arry object");
		float sum1=0;
		int count1=0;
		float sum2=0;
		int count2=0;
		float  sum3=0;
		int count3=0;
		for (int i=0;i<size ; i++ )
		{
			arr[i]=ch.nextInt();//storing the element
			sum3=sum3+arr[i];
		    count3++;
			if (arr[i]%2==0)
			{
				sum1=sum1+arr[i];
				count1++;
			}
				
				//logic for the odd sum
			else if (arr[i]%2!=0)
			{
				sum2=sum2+arr[i];
			    count2++;
			}
			
			
			
		}
		
		System.out.println("the sum of the even number is ;"+sum1);
		
		System.out.println("Average of the  even values in  arry object : " +sum1/count1);
		 System.out.println("the sum of the odd number is ;"+sum2);
		System.out.println("Average of the  odd values in  arry object : " +sum2/count2);
		 System.out.println("the sum of the aal element  "+sum3);
		System.out.println("Average of the  values in  arry object : " +sum3/count3);	
		
		
	}
}
