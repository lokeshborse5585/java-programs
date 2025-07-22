class DoubleTypeCasting 
	{
    public static void main(String[] args) 
		{
        double myDouble = 123.456;

        int myInt = (int) myDouble;           // Decimal truncated
        float myFloat = (float) myDouble;     // Reduced precision
        long myLong = (long) myDouble;        // Decimal truncated
        byte myByte = (byte) myDouble;        // May overflow if > 127
        short myShort = (short) myDouble;     // May overflow if > 32,767

        System.out.println("Original double value: " + myDouble);
        System.out.println("double to int: " + myInt);
        System.out.println("double to float: " + myFloat);
        System.out.println("double to long: " + myLong);
        System.out.println("double to byte: " + myByte);
        System.out.println("double to short: " + myShort);
    }
}