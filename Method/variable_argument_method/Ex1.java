class  Ex1 
{
	public static void main(String[] args) 
	{

	   //call the  method
	   add(10,45,74,1,2);
	}
	//public static void  add(datatyape... refrenace_variable)
	public static void add(int... h) {
		    ///for acessing the element
			int sum=0;
			for (int i=0 ;i<h.length;i++ )
			{
				sum+=h[i];
			}
			System.out.println("the sum of the " +h.length+" is " +sum);  
	}
}
