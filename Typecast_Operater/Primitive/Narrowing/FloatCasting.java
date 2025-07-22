 class FloatCasting
	 {
    public static void main(String[] args) 
		{
        float myFloat = 97.987f;

        byte b = (byte) myFloat;
        short s = (short) myFloat;
        int i = (int) myFloat;
        long l = (long) myFloat;
        double d = (double) myFloat; // This is widening, but shown here
        char c = (char) myFloat;

        System.out.println("Original float value: " + myFloat);
        System.out.println("float to byte: " + b);
        System.out.println("float to short: " + s);
        System.out.println("float to int: " + i);
        System.out.println("float to long: " + l);
        System.out.println("float to double: " + d); // widening
        System.out.println("float to char: " +c);
    }
}