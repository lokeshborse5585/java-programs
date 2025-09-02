class Reverse {
    public static void main(String[] args) {
        int num = 1209;
        System.out.println(reverse(num, 0));
    }

    // helper recursive function
    public static int reverse(int n, int rev) {
        if (n == 0) {
            return rev;
        }
        rev = (rev * 10) + (n % 10);  // last digit ko add karo
        return reverse(n / 10, rev);  // baaki digits ke liye call
    }
}
