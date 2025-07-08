# Pascal Triangle Encryption

## Problem Statement
Given an array of digits, perform the following encryption:

1. Repeatedly sum adjacent digits in the array.
2. From each sum, take only the unit digit (i.e., last digit or sum % 10).
3. Repeat the above process until only 2 digits remain.
4. The result is a 2-digit encrypted number.

**Example:**

```
Input: [2, 4, 7, 9]
Step 1: [2+4=6, 4+7=11, 7+9=16] → [6, 1, 6] (take unit digits)
Step 2: [6+1=7, 1+6=7] → [7, 7]
Output: [7, 7]
```

## Approach
1. While the array has more than 2 digits:
    - Create a new array by summing each pair of adjacent digits and taking the unit digit of each sum.
2. Return the final 2 digits.



## Solution (Java)
```java
import java.util.*;
public class PascalTriangleEncryption {
    public static int[] encrypt(int[] arr) {
        while (arr.length > 2) {
            int[] next = new int[arr.length - 1];
            for (int i = 0; i < arr.length - 1; i++) {
                next[i] = (arr[i] + arr[i+1]) % 10;
            }
            arr = next;
        }
        return arr;
    }
    // Example usage:
    // encrypt(new int[]{2, 4, 7, 9}) -> [7, 7]
}
```

## Complexity Analysis
- **Time Complexity:** O(n^2), where n is the initial length of the array.
- **Space Complexity:** O(n), for storing intermediate arrays.