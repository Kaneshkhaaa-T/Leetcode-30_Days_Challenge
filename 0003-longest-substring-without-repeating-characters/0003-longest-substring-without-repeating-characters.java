class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int left =0, right =0,len = 0, n = s.length();
        while(right<n){
            if(map.containsKey(s.charAt(right))){
                left = Math.max(map.get(s.charAt(right))+1,left);
            }
            map.put(s.charAt(right),right);
            len = Math.max(len,right-left+1);
            right++;
        }
        return len;
    }
}