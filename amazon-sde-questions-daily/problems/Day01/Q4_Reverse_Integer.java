public class Q4_Reverse_Integer {
    public static int reverse(int num){
        int sign = num > 0 ? 1 : -1;
        num = sign * num;

        long rev = 0;
        while(num > 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
            return 0;
        }

        return (int)rev * sign;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));  // Output: 321
        System.out.println(reverse(-123)); // Output: -321
        System.out.println(reverse(120));  // Output: 21
        System.out.println(reverse(0));    // Output: 0
        System.out.println(reverse(1534236469)); // Output: 0 (overflow case)
        System.out.println(reverse(-2147483648)); // Output: 0 (overflow case
    }
}
