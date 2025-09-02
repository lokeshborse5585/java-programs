class Caller_Method_Rule2 
{
	public static void main(String[] args) 
	{
		System.out.println("main stat");
		//test(1); error
		//test(1,0);//ithe yeun sodun jainl jo paryant aapn tyala print nay kart tya parnynat
	//	System.out.println(res); error: cannot find symbol
	     System.out.println(test(1,0));  //test () kale res aalya nanter to pune nay call kart barka jar tumhala puna call karayche asel tar puna calling  statment write kara
		//test(1,2,3); error
	     System.out.println (test(0,2));
		 int output=test(1,2);
		 System.out.println(output);
		//test("hi","bye");  error: incompatible types: String cannot be converted to int
	  int  ok=test('a','b');
	  System.out.println(ok);
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
	 // System.out.println("ok");  error: unreachable statement
	}
}
/* main stat
test stat
test end
1
test stat
test end
2
test stat
test end
3
test stat
test end
195
main end */