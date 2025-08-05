import java.util.*;

public class MapS {

    public static void main(String[] args) {
        HashMap<String, Integer> m = new HashMap<>();

        m.put("India", 120);
        m.put("US", 30);
        m.put("China", 150);

        System.out.println(m);

        m.put("China", 180);
        System.out.println(m);
        String a = "China";
        if(m.containsKey(a)){
            System.out.println("Present in map");
            System.out.println(m.get(a));
        } else {
            System.out.println("Not present");
            System.out.println(m.getOrDefault(a, 900));
        }

        for(Map.Entry<String, Integer> e : m.entrySet()){
            System.out.print(e.getKey() + " ");
            System.out.println(e.getValue());
        }

        Set<String> keys = m.keySet();

        for(String key : keys){
            System.out.println(key + " " + m.get(key) + " ");
        }

        System.out.println();

        System.out.println(m.size());



//        Set<Integer> samples = new HashSet<>();
//        int arr[] = {5, 2, 15, 11, 24, 2, 6, 5};
//
//        for(int b : arr){
//            samples.add(b);
//        }
//
//        System.out.println(samples);
//
//        List<Integer> list = new ArrayList<>();
//
//        for(int sample : samples){
//            list.add(sample);
//        }
//
//        System.out.println(list);

//        System.out.println(m.get("In"));
    }
}
