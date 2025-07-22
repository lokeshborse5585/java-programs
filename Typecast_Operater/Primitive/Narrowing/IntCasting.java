public class IntCasting {
    public static void main(String[] args) {
        int myInt = 123;

        byte b = (byte) myInt;
        short s = (short) myInt;
        long l = (long) myInt;      // Widening (no cast needed)
        float f = (float) myInt;    // Widening (no cast needed)
        double d = (double) myInt;  // Widening (no cast needed)
        char c = (char) myInt;

        System.out.println("Original int value: " + myInt);
        System.out.println("int to byte: " + b);
        System.out.println("int to short: " + s);
        System.out.println("int to long: " + l);
        System.out.println("int to float: " + f);
        System.out.println("int to double: " + d);
        System.out.println("int to char: " +c);
    }
}