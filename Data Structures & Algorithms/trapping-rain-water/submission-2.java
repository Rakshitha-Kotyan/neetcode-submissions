class Solution {
    public int trap(int[] height) {
        int maxLeft[] = new int[height.length];
        int maxRight[]= new int[height.length];

        int maxL=0;
        for(int i=0;i<height.length;i++){
            maxL=Math.max(maxL,height[i]);
            maxLeft[i]=maxL;
        }

        int maxR=0;
        for(int i=height.length-1;i>=0;i--){
            maxR=Math.max(maxR,height[i]);
            maxRight[i]=maxR;
        }

        int totalwater=0;
        for(int i=0;i<height.length;i++){
            int m=Math.min(maxLeft[i],maxRight[i])-height[i];
            if(m>0){
                totalwater+=m;
            }
        }

        return totalwater;
    }
}
