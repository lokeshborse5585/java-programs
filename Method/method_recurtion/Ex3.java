class Ex3

{
	public static void main(String[] args) 
	{
		System.out.println("main strat");
		print(10);
		
		System.out.println("main strat");
	}
	public static void print(int a)
	{
	
		if(a==0)
		{
			return;
		}
			System.out.println(a);
		a--;
		print(a);
		
	}
}
/* main strat
10
9
8
7
6
5
4
3
2
1
main strat  */ 
