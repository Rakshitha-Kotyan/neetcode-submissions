class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=max(piles);
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(MidBananaHour(piles,mid)<=h){
                ans=mid;
                high=mid-1;
            } else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static int max(int a[]){
        int maxx=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>maxx){
                maxx=a[i];
            }
        }
        return maxx;
    }

    public static int MidBananaHour(int ar[], int m){
        int hr=0;
        for(int i=0;i<ar.length;i++){
            hr+=Math.ceil((double) ar[i]/(double) m);
        }
        return hr;
    }
}
