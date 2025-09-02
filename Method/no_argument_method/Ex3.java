class   Ex3
{
	public static void main(String[] args) 
	{
		System.out.println("main method");
		//test(12);  error: method test in class Ex3 cannot be applied to given types
		//test (23,34); error: method test in class Ex3 cannot be applied to given types
			//test(0); error: method test in class Ex3 cannot be applied to given types
			test();
	}
	public static void test() 
	{
		System.out.println(" test method");
	}
	
}
