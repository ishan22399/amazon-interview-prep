public class Q12_Count_Character_In_String {
    public static int countCharacter(String s) {
        if(s == null || s.isEmpty()){
            return 0;
        }
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetter(s.charAt(i))){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countCharacter("hello right")); // 10
        System.out.println(countCharacter("character ")); // 9
        System.out.println(countCharacter("  example")); // 7
    }
}
