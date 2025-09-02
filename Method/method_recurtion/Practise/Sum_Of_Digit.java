class Sum_Of_Digit 
{
	public static void main(String[] args) 
	{
		System.out.println("main start");
		Scanner ch=new Scanner (System.in)
		long num=ch.nextInt();
		System.out.println("the sum of digit of number is"+sum(num));
		System.out.println("main end");
	}
	   public static long sum(long n)
	{
		   
		   if(n==0)
		{
			   return 0;
		}
		return =n%10+sum(n/10);
	}
}
