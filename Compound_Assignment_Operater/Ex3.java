class Ex3 
{
	public static void main(String[] args) 
	{
		
		int x=20;
		int y=30;
		int z=50;
		x+=y;
		y-=x+z;
		z*=x*y;
		System.out.println("final valve of the X is "+x);//50
		System.out.println("final valve of the Y is "+y);//-70
			System.out.println("final valve of the Z is "+z);//-175000
	}
}
