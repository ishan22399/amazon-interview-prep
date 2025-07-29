# Find In 2D Array

This problem involves searching for an element (number or word) in a 2D array and returning its position.

## Problem Statement
Given a 2D array, write a function to find the position of a target element. If the element is found, return its position as `[row, column]`. If not found, return `[-1, -1]`.

## Example
### For Numbers
```java
int[][] numArray = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
int[] result = findNum(numArray, 5); // Output: [1, 1]
```

### For Words
```java
String[][] wordArray = {
    {"hello", "world"},
    {"java", "programming"}
};
int[] result = findWord(wordArray, "java"); // Output: [1, 0]
```

## Approach
- Iterate through each row and column of the 2D array.
- Compare each element with the target.
- If found, return the position.
- If not found after the search, return `[-1, -1]`.

## Java Implementation
See `Q6_Find_In_2D_Array.java` for the full code.

## Edge Cases
- Empty array
- Target not present
- Multiple occurrences (returns first found)

## Output
- If found: prints the position
- If not found: prints "not found"

## Interview Tips
- Discuss time complexity: O(rows * cols)
- Mention edge case handling
- Explain how to adapt for sorted arrays (row/column wise)

---
