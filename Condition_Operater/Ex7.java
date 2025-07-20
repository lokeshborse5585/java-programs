class Ex8 //largest among three number
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		int c=30;
		int d=40;
		 int num=a>b?(a>c?(a>d?a:d):(c>d?c:d)):(b>c?(b>d?b:d):(c>d?c:d));
		 
		System.out.println(num +"largest  than remaning three value");
	}
}
