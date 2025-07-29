# Palindrome

## Problem Statement
Given an integer or a string, determine whether it is a palindrome. A palindrome is a sequence that reads the same backward as forward.

### Examples
- **Input:** `num = 12321`  
  **Output:** `true` (since 12321 reversed is 12321)
- **Input:** `longNum = 1234321L`  
  **Output:** `true` (since 1234321 reversed is 1234321)
- **Input:** `str = "madam"`  
  **Output:** `true` (since "madam" reversed is "madam")
- **Input:** `str = "hello"`  
  **Output:** `false`

## Constraints
- For integer palindrome: input can be int or long
- For string palindrome: input is a non-null string

## Approach
### For Integers
- Reverse the number using modulo and division
- Compare the reversed number with the original

### For Strings
- Use two pointers (start and end)
- Compare characters from both ends moving towards the center
- If all characters match, it's a palindrome

## Java Implementation
See `Q8_Palindrome.java` for the full code.

## Edge Cases
- Negative numbers (usually not considered palindrome)
- Empty string (should return true)
- Single character (should return true)

## Complexity
- Time: O(N) where N is the number of digits or length of string
- Space: O(1) for integer, O(N) for string reversal

## Output
- Returns `true`/`false` for boolean methods, `1`/`0` for int method
- Prints result in main method

## Interview Tips
- Discuss both iterative and string-based approaches
- Mention edge case handling
- Explain time and space complexity

---
