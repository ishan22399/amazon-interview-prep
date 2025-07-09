# Longest Substring Without Repeating Characters

## Problem Statement
Given a string `s`, find the length of the longest substring without repeating characters.

**Example:**
```
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
```

## Approach

### Brute Force Approach
1. Iterate over all possible starting indices of substrings.
2. For each starting index, use a set to track unique characters.
3. Extend the substring until a repeated character is found.
4. Update the maximum length found.
5. Time Complexity: O(n^2), where n is the length of the string.

### Optimized Approach (Sliding Window)
1. Use a sliding window with two pointers (`start` and `end`) to represent the current substring.
2. Use a hash map to store the last index of each character.
3. If a character is repeated, move the `start` pointer to the right of the previous occurrence.
4. Update the maximum length found.
5. Time Complexity: O(n), where n is the length of the string.

## Solution (Java)
```java
// Brute Force Approach
import java.util.*;
public class Q3_Longest_Substring_Without_Repeating_Characters {
    public static int solutionBruteForce(String s){
        int maxLen = 0;
        int Len = 0;

        Set<Character> unq = new HashSet<>();
        for(int i =0; i < s.length(); i++){
            unq.clear();
            Len = 0;

            for(int j = i; j < s.length(); j++){
                if(!unq.contains(s.charAt(j))){
                    unq.add(s.charAt(j));
                    Len = unq.size();
                }
                else{
                    break;
                }
            }

            maxLen = Math.max(maxLen, Len);
        }

        return maxLen;
    }
}

// Optimized Approach (Sliding Window)
import java.util.HashMap;
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLen = 0, start = 0;
        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            if (map.containsKey(c)) {
                start = Math.max(start, map.get(c) + 1);
            }
            map.put(c, end);
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }
}
```

## Complexity Analysis
- **Brute Force:** O(n^2) time, O(n) space.
- **Optimized:** O(n) time, O(min(n, m)) space, where m is the size of the character set.