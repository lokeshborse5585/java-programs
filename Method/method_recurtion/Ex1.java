class  Ex1
{
	public static void main(String[] args) 
	{
		System.out.println("main start");
		 print(1);
	
		 System.out.println("main end");
	}
	  public static void print(int a)
	{  System.out.println(a);
	  a++;
	  //base condition statment
	     if(a>10)
		{
		  return ;
		} 
			print(a);  //methos recurtion statment
	}
}
	/* 
			main start
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
main end   */
