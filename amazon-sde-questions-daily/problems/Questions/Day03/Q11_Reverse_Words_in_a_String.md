# Reverse Words in a String (LeetCode 151)

## Problem Statement
Given an input string `s`, reverse the order of the words. A word is defined as a sequence of non-space characters. The words in `s` will be separated by at least one space. Return a string of the words in reverse order joined by a single space.

---

## Examples
### Example 1
```
Input: s = "the sky is blue"
Output: "blue is sky the"
```

### Example 2
```
Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
```

### Example 3
```
Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
```

---

## Constraints
- 1 <= s.length <= 10^4
- `s` contains English letters (upper-case and lower-case), digits, and spaces
- There is at least one word in `s`

---

## Approach
1. **Trim** leading and trailing spaces.
2. **Split** the string by spaces to get words.
3. **Filter** out empty strings (from multiple spaces).
4. **Reverse** the list of words.
5. **Join** the words with a single space.

---

## Java Solution
```java
public String reverseWords(String s) {
    String[] words = s.trim().split("\\s+");
    StringBuilder sb = new StringBuilder();
    for (int i = words.length - 1; i >= 0; i--) {
        sb.append(words[i]);
        if (i != 0) sb.append(" ");
    }
    return sb.toString();
}
```

---

## Edge Cases
- Multiple spaces between words
- Leading/trailing spaces
- Single word input

---

## Complexity
- **Time:** O(N), where N is the length of the string
- **Space:** O(N), for storing words

---

## Interview Tips
- Always mention how you handle spaces
- Discuss time and space complexity
- Explain why you use `split("\\s+")` for multiple spaces

---
