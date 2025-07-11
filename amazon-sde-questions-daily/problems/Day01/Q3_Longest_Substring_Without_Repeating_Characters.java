import java.util.*;

public class Q3_Longest_Substring_Without_Repeating_Characters {
    public static int solutionBruteForce(String s){
        int maxLen = 0;
        int Len = 0;

        Set<Character> unq = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            unq.clear();
            Len = 0;

            for(int j = i; j < s.length(); j++){
                if(!unq.contains(s.charAt(j))){
                    unq.add(s.charAt(j));
                    Len = unq.size();
                }
                else{
                    break;
                }
            }

            maxLen = Math.max(maxLen, Len);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Brute Force: " + solutionBruteForce(s));
    }
}
