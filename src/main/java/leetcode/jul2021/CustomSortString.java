package leetcode.jul2021;

import java.util.HashMap;
import java.util.Map;

public class CustomSortString {
    public String accept(String order, String str) {
        Map<Character, Integer> strFrequencyMap = new HashMap<>();

        for(char c: str.toCharArray()){
            strFrequencyMap.put(c, strFrequencyMap.getOrDefault(c, 0) + 1);
        }

        StringBuilder result = new StringBuilder();
        for(char c : order.toCharArray()){
            if(!strFrequencyMap.containsKey(c)){
                continue;
            }

            for(int i=0; i < strFrequencyMap.get(c); i++){
                result.append(c);
            }
            strFrequencyMap.remove(c);
        }

        for(char c : strFrequencyMap.keySet()){
            for(int i=0; i < strFrequencyMap.get(c); i++){
                result.append(c);
            }
        }

        return result.toString();
    }
}
