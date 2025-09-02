class Ex2 
{
    static int a=20;
	
	public static void main(String[] args) 
	{
		System.out.println("main strat");
			System.out.println(a);
				System.out.println(b);
				test();
			System.out.println("main End");
	}
	static double b=14.5;
	public static void test()
	{
		int a=10;
		System.out.println(a);
				System.out.println(b);
				System.out.println(Ex1.a);
				

		
	}
}
/*E:\Java\Membar\Static_Membar\Static_Variable>java Ex2
main strat
20
14.5
10
14.5
10
main End
 */