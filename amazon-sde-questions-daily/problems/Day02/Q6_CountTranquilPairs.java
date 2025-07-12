import java.util.*;

public class Q6_CountTranquilPairs {
    public static int pairCount(List<Integer> tom, List<Integer> jerry, int N) {
        int count = 0;

        for(int i =0; i < N - 1; i++){
            for(int j = i + 1; j < N; j++){
                if(tom.get(i) * tom.get(j) == jerry.get(i) + jerry.get(j)){
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        List<Integer> tom = Arrays.asList(1, 2, 3, 4);
        List<Integer> jerry = Arrays.asList(2, 3, 4, 5);
        int N = tom.size(); 
        int result = pairCount(tom, jerry, N);
        System.out.println("Number of tranquil pairs: " + result);
    }
}