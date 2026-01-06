class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length-3; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            } else {
                for (int j = i + 1; j < nums.length-2; j++) {
                    if (j  > i+1 && nums[j] == nums[j - 1]) {
                        continue;
                    } else {
                        int k = j + 1;
                        int l = nums.length - 1;
                        while (k < l) {
                            if (k > j + 1 && nums[k] == nums[k - 1]) {
                                k++;
                                continue;
                            }
                            if (l < nums.length - 1 && nums[l] == nums[l + 1]) {
                                    l--;
                                    continue;
                            } 
                            long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
                            if (sum == target) {
                                List<Integer> list = new ArrayList<>();
                                list.add(nums[i]);
                                list.add(nums[j]);
                                list.add(nums[k]);
                                list.add(nums[l]);
                                ans.add(list);
                                k++;
                                l--;
                                while(k < l && nums[k] == nums[k - 1]) k++;
                                while(k < l && nums[l] == nums[l + 1]) l--;
                            } else if (sum< target) {
                                k++;
                            } else if (sum> target) {
                                l--;
                            }
                        }
                    }
                }
            }
        }
        return ans;
    }
}