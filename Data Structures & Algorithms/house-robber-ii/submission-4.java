class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int max1=hb1(0,n-1,nums);
        int max2=hb1(1,n,nums);
        return Math.max(max1,max2);
    }

    public static int hb1(int s, int e, int ar[]){
      int  rob1=0;
      int  rob2=0;
     if(ar.length==1){
        return ar[0];
     }

        for(int i=s;i<e;i++){
           int max=Math.max(rob1+ar[i], rob2);
            rob1=rob2;
            rob2=max;
        }
    
        return rob2;

    }
}
