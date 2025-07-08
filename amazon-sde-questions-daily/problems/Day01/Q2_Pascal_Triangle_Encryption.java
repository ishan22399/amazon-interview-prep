import java.util.*;

public class Q2_Pascal_Triangle_Encryption {
    public static String solution(int nums[]){
        List<Integer> code = new ArrayList<>();

        for(int num : nums){
            code.add(num);
        }

        while(code.size() > 2){
            List<Integer> temp = new ArrayList<>();
            for(int i = 0; i < code.size() - 1; i++){
                temp.add((code.get(i) + code.get(i + 1)) % 10);
            }

            code = temp;
        }

        return "" + code.get(0) + code.get(1);
    }

    public static void main(String[] args) {
        // Example usage
        int[] input = {1, 2, 3, 4, 5};
        String result = solution(input);
        System.out.println("Encrypted code: " + result);

        // Example 2
        int[] input2 = {2, 4, 7, 9};
        String result2 = solution(input2);
        System.out.println("Encrypted code: " + result2);
    }
}
