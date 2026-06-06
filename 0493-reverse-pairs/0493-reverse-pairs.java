class Solution {

    public int mergeSort(int arr[],int low,int high){
        
        int count =0;
        if(low>=high) return 0;
        int mid = (low+high)/2;
        count += mergeSort(arr,low,mid);
        count += mergeSort(arr,mid+1,high);
        count += countReversepair(arr,low,mid,high);
        merge(arr,low,mid,high);
        
        return count;
    }
    
    public int countReversepair(int arr[],int low,int mid,int high){
        int count = 0;
        int right = mid+1;
        for(int i=low;i<=mid;i++){
            while(right<=high && (long)arr[i] > 2L * arr[right]) right++;
            count = count+(right-(mid+1));
        }
        return count;
    }

    public void merge(int arr[],int low,int mid,int high){
        
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int left =low;
        int right = mid+1;
        
        while(left<= mid && right<= high){
            if(arr[left]>arr[right]){
                temp.add(arr[right]);
                right++;
            }
            else{
                temp.add(arr[left]);
                left++;   
            }
        }
        
        while(left<=mid){
            temp.add(arr[left]);
                left++;
        }
        while(right<=high){
            temp.add(arr[right]);
                right++;
        }
        
        for(int i=low;i<=high;i++){
            arr[i]=temp.get(i - low);
        }

    }

    public int reversePairs(int[] arr) {
        return mergeSort(arr,0,arr.length-1);
    }
}