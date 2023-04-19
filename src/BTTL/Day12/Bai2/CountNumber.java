package BTTL.Day12.Bai2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountNumber {
    public static void main(String[] args) {
        int count = 0;
        Map<Integer, Integer> map = new LinkedHashMap<>();
        Integer[] integer = {1, 2, 4, 7, 7, 8, 1, 2};
        for (Integer value : integer) {
            if (map.containsKey(value)) {
                map.put(value, count +=1);
            } else {
                map.put(value, 1);
            }
        }
        for (Integer value: map.keySet()) {
            System.out.println(value + "Số lần xuất hiện" + map.get(value));
        }
    }
}
