class Solution {
     public void reverseString(StringBuilder s, int start, int end){
        while(start<end){
            char temp = s.charAt(start);
            s.setCharAt(start,s.charAt(end));
            s.setCharAt(end,temp);
            start++;
            end--;
        }
    }
    public String reverseWords(String sb) {
        StringBuilder s = new StringBuilder(sb);
        int n = s.length();
        int i = 0, j = 0, start = 0, end = 0;
        reverseString(s,0,n-1);

        while(j<n){
            while (j < n && s.charAt(j) == ' ') j++;
            if(j==n) break;
            start = i;
            while(j < n && s.charAt(j) != ' '){
                if(i < s.length()){
                    s.setCharAt(i++,s.charAt(j++));
                } 
            }
            end = i-1;
            reverseString(s,start,end);

            if(j<n){
                if(i<s.length()){
                    s.setCharAt(i++,' ');
                }
                else {
                    s.append(' ');
                    i++;
                }
            }

        }

        if(i>0 && s.charAt(i-1)==' ') i--; 

        return s.substring(0,i);
    }
}