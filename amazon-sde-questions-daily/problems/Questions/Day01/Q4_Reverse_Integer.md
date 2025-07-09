# Reverse Integer

## Problem Statement
Given a signed 32-bit integer `x`, reverse its digits. If reversing `x` causes the value to go outside the signed 32-bit integer range `[-2^31, 2^31 - 1]`, return 0.

**Example:**
```
Input: x = 123
Output: 321

Input: x = -123
Output: -321

Input: x = 120
Output: 21

Input: x = 1534236469
Output: 0   // because reversed integer overflows
```

## Approach

### Brute Force Approach
1. Convert the integer to a string.
2. Reverse the string (handle the negative sign if present).
3. Convert the reversed string back to an integer.
4. If the result overflows 32-bit signed integer range, return 0.

### Optimized Approach (Mathematical)
1. Extract digits one by one from the end using modulo and division.
2. Build the reversed number by multiplying the result by 10 and adding the digit.
3. Before each step, check if the result will overflow.
4. Return 0 if overflow occurs.

## Solution (Java)
```java
// Brute Force Approach
public static int reverseBruteForce(int x) {
    boolean negative = x < 0;
    String str = Integer.toString(Math.abs(x));
    StringBuilder sb = new StringBuilder(str);
    sb.reverse();
    try {
        int reversed = Integer.parseInt(sb.toString());
        return negative ? -reversed : reversed;
    } catch (NumberFormatException e) {
        return 0; // overflow
    }
}

// Optimized Approach (Mathematical)
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
```

## Complexity Analysis
- **Brute Force:** O(k), where k is the number of digits (due to string operations).
- **Optimized:** O(k), where k is the number of digits (due to arithmetic operations).
- Both use O(1) extra space.