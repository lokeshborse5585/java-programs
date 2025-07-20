class Ex1//pre increment VARIABLE++ 
{
	public static void main(String[] args) 
	{   int a=10;//10//11//12//13//14//15
	     int b=a++ - ++a + ++a;//10-12+13//11//12//13
	     int c=a++ + ++b + a++ *++b;//13+12+14*13//207
		 
		
		System.out.println("pre Increment a  "+ ++a);//16
		System.out.println("pre Increment b "+ ++b);//14
		System.out.println("pre Increment  c "+ ++c);//208
	}
}
