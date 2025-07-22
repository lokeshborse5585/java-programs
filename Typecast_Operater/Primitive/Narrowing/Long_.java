class  Long_  // 8 byte
{
	public static void main(String[] args) 
	{     //data lossing are possible  in  the  Narrowing
		 // long to the  byte 
		/*  long a=128;
		   byte b=a;
		System.out.println(" long to the  byte : " +b);
		*/
		// above problem solve by tye  explicit type casting
		long a=100000;
		   byte b=(byte)a;
		   System.out.println(" long  value : " +a);//128
		System.out.println(" long to the  byte : " +b);//-128
		//Overflow Type narrowing
		// When you cast a larger value (long a = 128) into a smaller type (byte), Java keeps only the last 8 bits (the least significant byte) of the number.
        //Last 8 bits = 10000000 (in binary) = **-128** in 2's complement form
		
		//long to short
		short c=(short)a;
		System.out.println(" long to the  short : " +c);//128
		 
		
		/* long to char
		 char d=(long)a;
		System.out.println(" long to the   char : " +d);//incompatible types: possible lossy conversion from long to char
                
		*/
		 System.out.println(" long to the char not possible : ");
		//long to int
		 int e=(int)a;
		 System.out.println("Long to the int : " +e );
		 
		 //long to  float// this  is implicitly done not requred the explicitly
		  float f=a;
		  System.out.println(" long to the  float: " +f);//100000.0
		  
		  //long to double
		  double g=a;
		  System.out.println(" long to the double : "+g);//100000.0
		  
		   

		  
	}
}
