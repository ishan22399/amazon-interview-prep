# Container With Most Water

## Problem Statement
Given `n` non-negative integers `height[0], height[1], ..., height[n-1]`, where each represents a point at coordinate `(i, height[i])`. `n` vertical lines are drawn such that the two endpoints of the line `i` are at `(i, 0)` and `(i, height[i])`. Find two lines that together with the x-axis form a container, such that the container contains the most water.

**Note:** You may not slant the container.

## Example 1

**Input:**  
`height = [1,8,6,2,5,4,8,3,7]`  
**Output:** `49`

**Explanation:**  
The above vertical lines are represented by the array `[1,8,6,2,5,4,8,3,7]`.  
In this case, the max area of water (blue section) the container can contain is **49**.

![Container With Most Water](https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/17/question_11.jpg)

The area is calculated by taking the distance between the two lines (indices) and multiplying it by the height of the shorter line. In this example, the lines at index 1 (height 8) and index 8 (height 7) form the container with the largest area:  
`min(8, 7) * (8 - 1) = 7 * 7 = 49`.

## Approach

### Brute Force Approach
1. Check all pairs of lines.
2. For each pair, calculate the area as `width * min(height[i], height[j])`.
3. Track the maximum area found.
- **Time Complexity:** O(n^2)

### Two Pointer Approach (Optimal)
1. Initialize two pointers, one at the start and one at the end of the array.
2. Calculate the area between the two pointers.
3. Move the pointer pointing to the shorter line inward, as this may increase the area.
4. Repeat until the pointers meet.
- **Time Complexity:** O(n)

### Further Optimized Approach (Skip Redundant Heights)
- After moving a pointer, skip all lines that are not taller than the previous one, as they cannot form a larger area.
- This reduces unnecessary comparisons, especially for repeated heights.
- **Time Complexity:** Still O(n), but with fewer operations in practice.

## Solution (Java)
```java
// Brute Force Approach
public static int maxAreaBruteForce(int[] height) {
    int maxArea = 0;
    for (int i = 0; i < height.length - 1; i++) {
        for (int j = i + 1; j < height.length; j++) {
            int width = j - i;
            int minHeight = Math.min(height[i], height[j]);
            maxArea = Math.max(maxArea, width * minHeight);
        }
    }
    return maxArea;
}

// Two Pointer Approach
public static int maxArea(int[] height) {
    int maxArea = 0;
    int left = 0;
    int right = height.length - 1;
    while (left < right) {
        int width = right - left;
        int minHeight = Math.min(height[left], height[right]);
        maxArea = Math.max(maxArea, width * minHeight);
        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }
    return maxArea;
}

// Further Optimized Two Pointer Approach (Skip Redundant Heights)
public static int maxAreaSkip(int[] height) {
    int maxArea = 0;
    int left = 0;
    int right = height.length - 1;
    while (left < right) {
        int width = right - left;
        int minHeight = Math.min(height[left], height[right]);
        maxArea = Math.max(maxArea, width * minHeight);

        // Skip all lines that are not taller than current
        int prevLeft = height[left], prevRight = height[right];
        while (left < right && height[left] <= prevLeft) left++;
        while (left < right && height[right] <= prevRight) right--;
    }
    return maxArea;
}
```

## Complexity Analysis
- **Brute Force:** O(n^2) time, O(1) space.
- **Two Pointer:** O(n) time, O(1) space.
- **Skip Redundant Heights:** O(n) time, O(1) space (faster in practice due to fewer operations).
