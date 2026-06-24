class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        int low=0;
        int high=col*row-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(matrix[mid/col][mid%col]==target) return true;
            if(matrix[mid/col][mid%col]<target){
                low=mid+1;
            } else {
                high=mid-1;
            }
            System.out.println(mid);
        }
        //System.out.println(mid);
        return false;
    }
}
