import java.util.*;

public class TwoSum {

    static int[] sum(int arr[], int target){

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            int diff = target - arr[i];

            if(map.containsKey(diff)){
                return new int[] {i, map.get(diff)};
            } else {
                map.put(arr[i], i);
            }
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5 , 6};

        System.out.println(Arrays.toString(sum(arr, 7)));
    }
}
