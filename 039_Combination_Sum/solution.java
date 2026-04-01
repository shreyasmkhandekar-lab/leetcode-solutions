import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> allCombinations = new ArrayList<>();
        dfs(candidates, 0, target, new ArrayList<>(), allCombinations);
        return allCombinations;

    }

    private void dfs(int[] candidates, int index, int target, List<Integer> currentCombination, List<List<Integer>> allCombinations){

        if(target == 0){
            allCombinations.add(new ArrayList<>(currentCombination));
            return;
        }
        if (index >= candidates.length || target < 0){
            return;
        }

        currentCombination.add(candidates[index]);

        dfs(candidates, index, target - candidates[index], currentCombination, allCombinations);

        currentCombination.remove(currentCombination.size() - 1);

        dfs(candidates, index + 1, target, currentCombination, allCombinations);
    }
}