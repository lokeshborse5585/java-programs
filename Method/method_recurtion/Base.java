//print 1 to 10
class  Base
{
	public static void main(String[] args) 
	{
		System.out.println("main strat");
		print(1);
		System.out.println("main end");
	}
	public static void print(int a)
	{
		/*System.out.println(a);
		
		
			//System.out.println(a);
		a++;
		print(a); */
		System.out.println(a);
		if(a>=10)
		{
			return ;
		}
	           a++;
				print(a);
		 
		
		
	}
}

/* 
main strat
1
2
3
4
5
6
7
8
9
10
main end  */
