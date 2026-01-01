class Solution {

    public void generateSubset (int[] nums,int index,List<List<Integer>> ans,int length,List<Integer> backup){
            
            ans.add(new ArrayList<>(backup));
            for(int i = index;i<length;i++){
                if(i != index && nums[i] == nums[i-1]) continue;
                backup.add(nums[i]);
                generateSubset(nums,i+1,ans,length,backup);
                backup.remove(backup.size()-1);
            }



    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> backup = new ArrayList<>();
        int length = nums.length;
        generateSubset(nums,0,ans,length,backup);
        return ans;
    }
}