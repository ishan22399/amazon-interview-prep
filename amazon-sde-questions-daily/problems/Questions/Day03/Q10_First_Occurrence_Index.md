# First Occurrence Index in String (LeetCode 28)

## Problem Statement
Given two strings `haystack` and `needle`, return the index of the first occurrence of `needle` in `haystack`, or `-1` if `needle` is not part of `haystack`.

---

## Examples
### Example 1
```
Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6. The first occurrence is at index 0.
```

### Example 2
```
Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" does not occur in "leetcode".
```

---

## Constraints
- 1 <= haystack.length, needle.length <= 10^4
- haystack and needle consist of only lowercase English characters.

---

## Approach
1. **Brute Force:**
   - Iterate through each possible starting index in `haystack`.
   - For each index, check if the substring matches `needle`.
   - Return the index if a match is found, else return -1.
2. **Optimized (KMP Algorithm):**
   - For large inputs, use Knuth-Morris-Pratt (KMP) for O(N+M) time.
   - Not required for interviews unless asked for optimal solution.

---

## Java Solution
```java
public int strStr(String haystack, String needle) {
    int n = haystack.length(), m = needle.length();
    for (int i = 0; i <= n - m; i++) {
        if (haystack.substring(i, i + m).equals(needle)) {
            return i;
        }
    }
    return -1;
}
```

---

## Edge Cases
- `needle` longer than `haystack`: return -1
- `needle` is empty: return 0 (LeetCode convention)
- Multiple occurrences: return the first index

---

## Complexity
- **Time:** O(N * M) in worst case (N = haystack length, M = needle length)
- **Space:** O(1)

---

## Interview Tips
- Always mention edge cases and constraints
- Discuss brute force and optimal solutions
- Explain substring matching logic
- If asked, mention KMP or Rabin-Karp for optimality

---