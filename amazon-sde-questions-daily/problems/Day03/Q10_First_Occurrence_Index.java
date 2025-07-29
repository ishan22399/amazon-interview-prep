public class Q10_First_Occurrence_Index {
    public static int strStr(String haystack, String needle) {
        int idx = haystack.indexOf(needle);
        return idx;
    }

    public static int newStrStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }

        if(needle.length() > haystack.length()){
            return -1;
        }
        
        for(int i = 0; i < haystack.length() - needle.length() + 1; i++){
             if(haystack.charAt(i) == needle.charAt(0)){
                 if(haystack.substring(i, needle.length() + i).equals(needle)){
                     return i;
                 }
             }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll")); // 2
        System.out.println(strStr("aaaaa", "bba")); // -1
        System.out.println(strStr("", "")); // 0

        System.out.println(newStrStr("hello", "ll")); // 2
        System.out.println(newStrStr("aaaaa", "bba")); // -1
        System.out.println(newStrStr("", "")); // 0
        System.out.println(newStrStr("abc", "d")); // -1
    }
}
