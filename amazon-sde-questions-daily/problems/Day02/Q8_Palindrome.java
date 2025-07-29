public class Q8_Palindrome {
    static boolean isPalindrome(int num){
        long original = num;
        long reversed = 0;

        while(num > 0){
            reversed = reversed * 10 + (long) (num % 10);
            num /= 10;
        }

        return  reversed == original;
    }

    static int isPalindrome(long num){
        String rev = "";
        long original = num;

        while(original > 0){
            int digit = (int)(original % 10);
            rev = digit + rev;
            original /= 10;
        }

        return rev.equals(new StringBuilder(String.valueOf(num)).reverse().toString()) ? 1 : 0;
    }

    static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length() - 1;

        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        int num = 12321;
        System.out.println("Is " + num + " a palindrome? " + isPalindrome(num));

        long longNum = 1234321L;
        System.out.println("Is " + longNum + " a palindrome? " + (isPalindrome(longNum) == 1 ? "Yes" : "No"));

        String str = "madam";
        System.out.println("Is \"" + str + "\" a palindrome? " + isPalindrome(str));
    }
    
}
