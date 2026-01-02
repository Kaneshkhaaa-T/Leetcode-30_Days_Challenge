class Solution {

    public void findCombinationSum(int ind, int[] nums, int target, List<Integer> backup,List<List<Integer>> ans){

        if(target==0){
            ans.add(new ArrayList<>(backup));
            return;
        }
        if (ind == nums.length || target < 0) return;
        for(int i = ind;i<nums.length;i++){
            if (i > ind && nums[i] == nums[i - 1]) continue;
            if(nums[i]<=target){
                backup.add(nums[i]);
                findCombinationSum(i+1,nums,target-nums[i],backup,ans);
                backup.remove(backup.size() - 1);
            }
        }

    }
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> backup = new ArrayList<>();
        findCombinationSum(0,nums,target,backup,ans);
        return ans;
    }
}


