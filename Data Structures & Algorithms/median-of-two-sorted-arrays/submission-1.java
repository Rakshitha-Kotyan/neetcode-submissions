class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int l1=nums1.length;
        int l2=nums2.length;
        int med1=0;
        int med2=0;
        for(int count=0;count < (l1+l2)/2+1;count++){
            med2=med1;
            if(i<l1 && j<l2){
                if(nums1[i]>nums2[j]){
                    med1=nums2[j];
                    j++;
                } else {
                    med1=nums1[i];
                    i++;
                }
            } else {
                if(i<l1){
                    med1=nums1[i];
                    i++;
                } else {
                    med1=nums2[j];
                    j++;
                }
            }
        }
        if((l1+l2)%2==1){
            return (double) med1;
        } else {
            return (med1+med2)/2.0;
        }

    }
}
