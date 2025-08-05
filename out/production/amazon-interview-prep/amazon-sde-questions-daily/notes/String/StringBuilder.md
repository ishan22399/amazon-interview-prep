# StringBuilder in Java

`StringBuilder` is a mutable sequence of characters. It is used to create and manipulate strings efficiently, especially when frequent modifications are required.

## Key Features
- Mutable (can change contents without creating new objects)
- Faster than `String` for concatenation
- Not thread-safe (use `StringBuffer` for thread safety)

## Constructors
```java
StringBuilder sb1 = new StringBuilder(); // Empty builder
StringBuilder sb2 = new StringBuilder("Hello"); // With initial string
StringBuilder sb3 = new StringBuilder(50); // With initial capacity
```

## Common Methods

| Method | Description | Example |
|--------|-------------|---------|
| `append()` | Adds text to the end | `sb.append("World");` |
| `insert()` | Inserts text at index | `sb.insert(5, "Java");` |
| `delete()` | Removes chars from start to end-1 | `sb.delete(0, 5);` |
| `deleteCharAt()` | Removes char at index | `sb.deleteCharAt(2);` |
| `replace()` | Replaces chars from start to end-1 | `sb.replace(0, 5, "Hi");` |
| `reverse()` | Reverses the sequence | `sb.reverse();` |
| `setCharAt()` | Sets char at index | `sb.setCharAt(0, 'J');` |
| `toString()` | Converts to `String` | `String str = sb.toString();` |
| `length()` | Returns length | `int len = sb.length();` |
| `capacity()` | Returns current capacity | `int cap = sb.capacity();` |
| `ensureCapacity()` | Ensures minimum capacity | `sb.ensureCapacity(100);` |
| `charAt()` | Gets char at index | `char c = sb.charAt(1);` |
| `substring()` | Gets substring | `String sub = sb.substring(2, 5);` |

## Example Usage

```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World"); // Hello World
sb.insert(6, "Java "); // Hello Java World
sb.replace(0, 5, "Hi"); // Hi Java World
sb.delete(3, 8); // Hi World
sb.reverse(); // dlroW iH
System.out.println(sb.toString()); // dlroW iH
```

## When to Use
- When you need to modify strings frequently (e.g., in loops)
- When performance is important

## Note
- For thread-safe operations, use `StringBuffer`.
- For simple, immutable strings, use `String`.
