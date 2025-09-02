import java.util.Scanner;

class LargestDigit {
    static int largest(int num) {
        // base case
        if (num == 0) {
            return 0;
        }

        int last = num % 10;        // last digit nikala
        int remaining = largest(num / 10);  // baaki number ka largest nikala

        // compare simple if else se
        if (last > remaining) {
            return last;
        } else {
            return remaining;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Largest digit: " + largest(n));
    }
}
