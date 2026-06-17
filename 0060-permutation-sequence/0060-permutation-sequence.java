class Solution {
    public String getPermutation(int n, int k) {
        int factorial = 1;
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=1;i<n;i++){
            factorial = factorial*i; // we dont need n!, need (n-1)!
            list.add(i);
        }
        list.add(n);
        String ans ="";
        k=k-1;

        while(true){
            ans = ans + list.get(k/factorial);
            list.remove(k/factorial);
            if(list.size()==0) break;
            k = k % factorial;
            factorial = factorial/list.size();
        }
        return ans;

    }
}