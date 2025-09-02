class Caller_Method_Rule 
{
	public static void main(String[] args) 
	{
		System.out.println("main stat");
		//test(1); error
		test(1,0);
		//test(1,2,3); error
		test(0,2);
		test(1,2);
		//test("hi","bye");  error: incompatible types: String cannot be converted to int
		test('a','b');
		//test(6.6,3);  error: incompatible types: possible lossy conversion from double to int
		
			
			System.out.println("main end ");
		
	}
	public static int  test(int a ,int b) 
	{
		System.out.println("test stat");
		int res=a+b;
		int sub =a-b;
		
			System.out.println("test end");
	//return ; error: incompatible types: missing return value
	return res;
	}
}
