class Solution {

    public void findCombinationSum(int ind, int[] nums, int target, List<Integer> backup,List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(backup));
            return;
        }
        if (ind == nums.length || target < 0) return;
        if(nums[ind]<=target){
            backup.add(nums[ind]);
            findCombinationSum(ind,nums,target-nums[ind],backup,ans);
            backup.remove(backup.size() - 1);
        }
        findCombinationSum(ind+1,nums,target,backup,ans);
    }

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> backup = new ArrayList<>();
        findCombinationSum(0,nums,target,backup,ans);
        return ans;
    }
}