import java.util.*;

public class MajorityElement {
    static void occurence(int[] arr){
        int n = arr.length;
        HashSet<Integer> unq= new HashSet<>();;
        for(int i = 0; i < arr.length; i++){
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }

            if(count > (n / 3)){
                // System.out.println(arr[i] + "is a Majority Element");
                unq.add(arr[i]);
            }
        }

        System.out.println(unq);
    }

    static void occurence(int[] arr, int n){
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(freq.containsKey(arr[i])){
                int val = freq.get(arr[i]);
                val++;
                freq.put(arr[i], val);
            } else {
                freq.put(arr[i], 1);
            }
        }

        for(Map.Entry<Integer, Integer> e : freq.entrySet()){
            if(e.getValue() > (n / 3)){
                System.out.println(e.getKey());
            }
        }

        // System.out.println(freq);
    }

    static void occurrence(int[] arr, int n) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        // Step 1: Build frequency map using getOrDefault
        for (int i = 0; i < n; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }

        // Step 2: Print elements occurring more than n/3 times
        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            if (e.getValue() > n / 3) {
                System.out.println(e.getKey());
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 1, 3, 2, 1, 1, 2, 2};

        occurence(arr, arr.length);
    }
}
