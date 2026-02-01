class Solution {
    public int[] twoSum(int[] arr, int target) {
        int[] ans = new int[2];
        int n = arr.length;
        int[] nums = new int[n];
        for(int i =0;i<n;i++){
            nums[i] = arr[i];
        }
        Arrays.sort(nums);
        int i = 0;
        int j = n-1;
        while(i<j){
            if(nums[i]+nums[j] == target){
                ans[0]=nums[i];
                ans[1]=nums[j];
                break;
            }
            else if(nums[i]+nums[j]>target){
                    j--;
            }
            else{
                i++;
            }
        }
        boolean b1 = true;
        boolean b2 = true;
        for(int k =0;k<n;k++){
            if(b1 && arr[k]==ans[0]){
                ans[0] =k;
                b1 = false;
            }
            else if(b2 && arr[k]==ans[1]){
                ans[1]=k;
                b2 = false;
            }
        }
        return ans;
    }
}