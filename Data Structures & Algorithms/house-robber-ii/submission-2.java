class Solution {
    public int rob(int[] nums) {
        int r1=0;
        int r2=0;
        int max1=0;
        int max2=0;
        int n=nums.length;
        max1=hb1(r1,r2,0,n-1,nums);
        max2=hb1(r1,r2,1,n,nums);
        System.out.println(max1+" "+max2);
        return Math.max(max1,max2);
        

        
    }

    public static int hb1(int rob1, int rob2,int s, int e, int ar[]){
        rob1=0;
        rob2=0;
      int max=ar[0];

        for(int i=s;i<e;i++){
            max=Math.max(rob1+ar[i], rob2);
            rob1=rob2;
            rob2=max;
        }
    
        return max;

    }
}
