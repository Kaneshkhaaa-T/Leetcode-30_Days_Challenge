class Solution {

    
    public List<List<Integer>> generate(int num) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 1;i<=num;i++){
            List<Integer> temp = new ArrayList<>();
            int backup = 1;
            temp.add(1);
            for(int j=1;j<i;j++){
               backup = backup*(i-j);
               backup=backup/j;
               temp.add(backup);
            }
            ans.add(temp);
        }
        return ans;
    }
}