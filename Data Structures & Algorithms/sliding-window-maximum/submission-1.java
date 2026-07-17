class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n= nums.length;
        int res[] = new int[n-k+1];
        Deque<Integer> d = new LinkedList<>();
        int l=0;
        int r=0;
        while(r<n){
            while(!d.isEmpty() && nums[d.getLast()]<nums[r]){
                d.removeLast();
            }
            d.addLast(r);

            if(l>d.getFirst()){
                d.removeFirst();
            }

            if((r+1) >=k){
                res[l]=nums[d.getFirst()];
                l++;
            }
            r++;
        }

        return res;
    }
}
