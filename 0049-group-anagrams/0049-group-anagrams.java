import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // Sort character array to create canonical key
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedKey = new String(chars);

            // Group original word under its canonical key
            map.computeIfAbsent(sortedKey, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }
}