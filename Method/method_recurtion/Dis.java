class Dis
{
	public static void main(String[] args) 
	{
		System.out.println("main strat");
		print();
		System.out.println("main End");
	}
	public static void print()
	{ 
		System.out.println("print strat");
	
	    System.out.println("print end");
		print();
		return;
	} 
}
