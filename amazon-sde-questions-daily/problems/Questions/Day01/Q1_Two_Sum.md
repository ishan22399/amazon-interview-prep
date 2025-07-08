# Two Sum

## Problem Statement
Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

**Example:**

```
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
```

## Approach
1. Use a hash map to store the value and its index as you iterate through the array.
2. For each element, check if `target - nums[i]` exists in the hash map.
3. If it exists, return the indices.
4. Otherwise, add the current element to the hash map.

## Solution (Java)
```java
import java.util.HashMap;
public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement)) {
            return new int[] { map.get(complement), i };
        }
        map.put(nums[i], i);
    }
    return new int[]{};
}
```

## Complexity Analysis
- **Time Complexity:** O(n), where n is the number of elements in the array.
- **Space Complexity:** O(n), for the hash map.
