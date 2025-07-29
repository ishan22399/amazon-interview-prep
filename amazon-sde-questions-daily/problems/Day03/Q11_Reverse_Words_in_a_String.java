public class Q11_Reverse_Words_in_a_String {
    public static String reverseWords(String s) {
        if(s == null || s.isEmpty()) {
            return s;
        }

        String[] word = s.split(" +");
        StringBuilder sb = new StringBuilder();

        for(int i = word.length - 1; i >= 0; i--){
            sb.append(word[i]);
            sb.append(" ");
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue")); // "blue is sky the"
        System.out.println(reverseWords("  hello world  ")); // "world hello"
        System.out.println(reverseWords("a good   example")); // "example good a"
    }
}
