class Solution {

    public void generatePermutatuion(int ind, int[] nums, List<List<Integer>> ans){
        if(ind == nums.length){
            List<Integer> backup = new ArrayList<>();
            for(int i =0;i<nums.length;i++){
                backup.add(nums[i]);
            }
            ans.add(new ArrayList<>(backup));
            return;
        }
        for(int i = ind;i<nums.length;i++){
            swap(i,ind,nums);
            generatePermutatuion(ind+1,nums,ans);
            swap(i,ind,nums);
        }
    }
    public void swap(int i,int j,int[] nums){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j] = temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        generatePermutatuion(0,nums,ans);
        return ans;
    }
}