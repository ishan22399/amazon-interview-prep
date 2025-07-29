## Q12. Count Character In String

Given a string `s`, write a function to count the number of alphabetic characters (letters) in the string. Ignore spaces, digits, and special characters.

### Example 1
```
Input: s = "hello right"
Output: 10
Explanation: All characters except the space are letters.
```

### Example 2
```
Input: s = "character "
Output: 9
Explanation: The space at the end is ignored.
```

### Example 3
```
Input: s = "  example"
Output: 7
Explanation: Only the letters are counted.
```

### Constraints
- `0 <= s.length <= 10^4`
- `s` may contain letters, digits, spaces, and special characters.

### Function Signature
```java
public static int countCharacter(String s)
```