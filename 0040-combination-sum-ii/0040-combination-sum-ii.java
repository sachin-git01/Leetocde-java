import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, new ArrayList<>(), results);
        return results;
    }

    private void backtrack(int[] candidates, int remain, int start, 
                           List<Integer> current, List<List<Integer>> results) {
        if (remain == 0) {
            results.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            // Early pruning: remaining numbers are too large
            if (candidates[i] > remain) {
                break;
            }

            // Skip duplicate elements at the same tree depth
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }

            current.add(candidates[i]);
            // Recurse to next index (i + 1) because each element can be used once
            backtrack(candidates, remain - candidates[i], i + 1, current, results);
            current.remove(current.size() - 1); // Backtrack
        }
    }
}