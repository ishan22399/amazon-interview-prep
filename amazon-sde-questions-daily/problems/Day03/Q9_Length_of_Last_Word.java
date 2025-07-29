public class Q9_Length_of_Last_Word {
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int right = s.length() - 1;
        int count = 0;
        while(right >= 0){
            if(s.charAt(right) != ' '){
                count++;
            } else {
                break;
            }
            right--;
        }

        return count;
    }

    public static int newLengthOfLastWord(String s) {
        int count = 0;
        String b = s.trim();

        if(b.isEmpty()) {
            return 0;
        }

        if(b.length() == 1 && Character.isLetter(b.charAt(0))) {
            return 1;
        }

        for(int i = b.length() - 1; i >= 0; i--){
            if(!Character.isLetter(b.charAt(i))){
                break;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World")); // 5
        System.out.println(lengthOfLastWord("   fly me   to   the moon  ")); // 4
        System.out.println(lengthOfLastWord("luffy is still joyboy")); // 6
    }
}
