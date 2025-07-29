# Java String Methods with Examples

Java's `String` class provides many useful methods for string manipulation. Here is a summary of commonly used methods with examples:

## Creation & Basic Methods

- `length()`: Returns the length of the string.
    ```java
    String s = "hello";
    int len = s.length(); // 5
    ```

- `charAt(int index)`: Returns the character at the specified index.
    ```java
    char c = s.charAt(1); // 'e'
    ```

- `substring(int beginIndex)`, `substring(int beginIndex, int endIndex)`: Extracts a substring.
    ```java
    String sub1 = s.substring(2);      // "llo"
    String sub2 = s.substring(1, 4);   // "ell"
    ```

- `toLowerCase()`, `toUpperCase()`: Converts string to lower/upper case.
    ```java
    String lower = s.toLowerCase(); // "hello"
    String upper = s.toUpperCase(); // "HELLO"
    ```

- `trim()`: Removes leading and trailing whitespace.
    ```java
    String t = "  hello  ";
    String trimmed = t.trim(); // "hello"
    ```

## Comparison

- `equals(Object another)`: Compares two strings for equality.
    ```java
    boolean eq = s.equals("hello"); // true
    ```

- `equalsIgnoreCase(String another)`: Compares two strings, ignoring case.
    ```java
    boolean eqIC = s.equalsIgnoreCase("HELLO"); // true
    ```

- `compareTo(String another)`: Lexicographically compares two strings.
    ```java
    int cmp = s.compareTo("world"); // negative value
    ```

## Searching

- `indexOf(int ch)`, `indexOf(String str)`: Returns index of first occurrence.
    ```java
    int idx1 = s.indexOf('l');    // 2
    int idx2 = s.indexOf("lo");   // 3
    ```

- `lastIndexOf(int ch)`, `lastIndexOf(String str)`: Returns index of last occurrence.
    ```java
    int lastIdx1 = s.lastIndexOf('l');    // 3
    int lastIdx2 = s.lastIndexOf("el");  // 1
    ```

- `contains(CharSequence seq)`: Checks if sequence is present.
    ```java
    boolean has = s.contains("ll"); // true
    ```

## Modification

- `replace(char oldChar, char newChar)`: Replaces characters.
    ```java
    String r1 = s.replace('l', 'x'); // "hexxo"
    ```

- `replace(CharSequence target, CharSequence replacement)`: Replaces sequences.
    ```java
    String r2 = s.replace("ll", "yy"); // "heyyo"
    ```

- `replaceAll(String regex, String replacement)`: Replaces using regex.
    ```java
    String r3 = s.replaceAll("l+", "z"); // "hezzo"
    ```

- `replaceFirst(String regex, String replacement)`: Replaces first match using regex.
    ```java
    String r4 = s.replaceFirst("l", "z"); // "hezlo"
    ```

## Splitting & Joining

- `split(String regex)`: Splits string into array using regex.
    ```java
    String csv = "a,b,c";
    String[] arr = csv.split(","); // ["a", "b", "c"]
    ```

- `join(CharSequence delimiter, CharSequence... elements)`: Joins elements with delimiter (static method).
    ```java
    String joined = String.join("-", "a", "b", "c"); // "a-b-c"
    ```

## Other Useful Methods

- `startsWith(String prefix)`, `endsWith(String suffix)`: Checks start/end.
    ```java
    boolean sw = s.startsWith("he"); // true
    boolean ew = s.endsWith("lo");   // true
    ```

- `isEmpty()`: Checks if string is empty.
    ```java
    boolean empty = "".isEmpty(); // true
    ```

- `toCharArray()`: Converts string to character array.
    ```java
    char[] chars = s.toCharArray(); // ['h', 'e', 'l', 'l', 'o']
    ```

- `getBytes()`: Converts string to byte array.
    ```java
    byte[] bytes = s.getBytes();
    ```

- `valueOf(Object obj)`: Returns string representation of object (static method).
    ```java
    String str = String.valueOf(123); // "123"
    ```

- `format(String format, Object... args)`: Returns formatted string (static method).
    ```java
    String fmt = String.format("Hi %s!", "Alice"); // "Hi Alice!"
    ```

Refer to [Java String API documentation](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html) for more details.