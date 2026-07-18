class Solution {
    public int findMin(int[] a) {
        int low=0;
        int n=a.length;
        int high=n-1;
        int min=Integer.MAX_VALUE;
        while(low<=high){
            if(a[low]<a[high]) {
                min=Math.min(min,a[low]);
                break;
            }
            int mid=(low+high)/2;

            if(a[low]<=a[mid]){
                min=Math.min(a[low],min);
                low=mid+1;
            }else{
                min=Math.min(a[mid],min);
                high=mid-1;
            }
        }
        return min;
    }
}
