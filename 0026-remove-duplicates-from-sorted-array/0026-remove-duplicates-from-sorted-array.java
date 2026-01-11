class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0, j = i+1;
        while(i<nums.length && j<nums.length){
            if(nums[i]!=nums[j]){
                nums[i+1]=nums[j];
                i++;
            }
            j++;
        }
        return i+1;
    }
}