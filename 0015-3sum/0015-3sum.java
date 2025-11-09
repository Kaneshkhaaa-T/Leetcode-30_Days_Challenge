class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0;i<n-2;i++){
            int j = i+1;
            int k = n-1;
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            while(j<k){
                
                if(nums[i]+nums[j]+nums[k]==0){
                    List<Integer> store = new ArrayList<>();
                    store.add(nums[i]);
                    store.add(nums[j]);
                    store.add(nums[k]);
                    ans.add(store);
                    j++;
                    k--;
                    while(j < k && nums[j]==nums[j-1]) j++;
                    while(j < k && nums[k]==nums[k+1]) k--;
                }

                if(nums[i]+nums[j]+nums[k]>0){
                    k--;
                }
                if(nums[i]+nums[j]+nums[k]<0){
                    j++;
                }
            }
        }
        return ans;
    }
}