# Count Tranquil Pairs

This problem involves finding the number of tranquil pairs in two lists, Tom and Jerry, based on a specific condition.

## Problem Statement
Given two lists of integers, `tom` and `jerry`, each of length `N`, count the number of pairs `(i, j)` such that:

```
tom[i] * tom[j] == jerry[i] + jerry[j]
```
where `0 <= i < j < N`.

## Example
```java
List<Integer> tom = Arrays.asList(1, 2, 3, 4);
List<Integer> jerry = Arrays.asList(2, 3, 4, 5);
int N = tom.size();
int result = pairCount(tom, jerry, N); // Output: 0
```

## Approach
- Use two nested loops to check all pairs `(i, j)` where `i < j`.
- For each pair, check if the product of `tom[i]` and `tom[j]` equals the sum of `jerry[i]` and `jerry[j]`.
- Increment the count if the condition is satisfied.
- Return the final count.

## Java Implementation
See `Q6_CountTranquilPairs.java` for the full code.

## Edge Cases
- Lists of length less than 2 (no pairs possible)
- Negative numbers in lists
- Multiple pairs satisfying the condition

## Output
- Prints the number of tranquil pairs found

## Interview Tips
- Discuss time complexity: O(N^2)
- Mention how to optimize if constraints are large (e.g., using hashing for sum/product pairs)
- Explain edge case handling

---
