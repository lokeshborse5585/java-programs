import java.util.Scanner;
class  Ex1
{
	public static void main(String[] args) 
	{ 
		//Scanner ch=new Scanner();
		//System.out.println("Hello World!");
		//creting the aary object
		int[] arr=new int[4];
		arr[0]=12;
		arr[1]=34;
		arr[2]='a';
		arr[2+1]=5;
		//arr[4]=6;// Index 4 out of bounds for length 4
		System.out.println("arry is complated");
		//to aasce the element
		System.out.println(arr.length);
		for (int i=0;i<arr.length ;i++ )
		{
			System.out.println(arr[i]);
		}
				

		
	}
}
/* arry is complated
12
34
4
5 */
