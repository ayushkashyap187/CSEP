package STRINGS;

import java.util.HashMap;

public class q_242 {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()) {
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();

        char[] arr1=s.toCharArray();
        for (int i = 0; i < arr1.length; i++) {
            char c=arr1[i];
            map.put(c,map.getOrDefault(c,0)+1);
        }
        char[] arr2=t.toCharArray();
        for (int i = 0; i < arr2.length; i++) {
            char c=arr2[i];

            if (!map.containsKey(c)) return false;
            map.put(c,map.getOrDefault(c,0)-1);

            if (map.get(c)==0) map.remove(c);
        }
        return map.isEmpty();
    }
}
