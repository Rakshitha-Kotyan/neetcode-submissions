class Solution {
    public int trap(int[] height) {
        int maxL[] = new int[height.length];
        int maxR[] = new int[height.length];

        int max1=height[0];
        for(int i=0;i<height.length;i++){
            max1=Math.max(max1,height[i]);
            maxL[i]=max1;
            
        }

        int max2=height[height.length-1];
        for(int i=height.length-1;i>=0;i--){
            max2=Math.max(max2,height[i]);
             maxR[i]=max2;
            
        }
        int total=0;
        for(int i=0;i<height.length;i++){
            total+=Math.min(maxL[i],maxR[i])-height[i];
            if(total<0){
                total=0;
            }
        }
        return total;
    }
}
