class Ex3
{
	public static void main(String[] args) 
	{
		System.out.println("rules of the variabvle argument");
		add("lokesh",'a','A',2,5);
		//sequences of data passing is must same with the  formal argument
	}
		public static void add(String s,char ch, int...a) 
	{
		System.out.println(s);	
		System.out.println(ch);	
		for ( int i=0; i<a.length;i++ )
		{
			System.out.println(a[i]);	
		}
		 
	}
}
