//The Fibonacci series is a list of numbers where every number is the sum of the two numbers before it.
class FibonacciRec
{

    public static void main(String[] args) 
	{
        int num = 7;
        System.out.println("Fibonacci series up to " + num + " terms:");
        for (int i = 0; i < num; i++)
		{
            System.out.print(fibonacci(i) + " ");
        }
    }
	
	
    // Recursive method
    public static int fibonacci(int n)
	{
        if (n <= 1)  // base case
            
		{
			return n;
		}
        return fibonacci(n - 1) + fibonacci(n - 2);  // recursive call
    }
}
