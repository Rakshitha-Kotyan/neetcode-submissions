class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> l= new ArrayList<>();
        int n=intervals.length;
        //before the new intervals
        int i=0;
        while(i<n && intervals[i][1] < newInterval[0]){
            l.add(intervals[i]);
            i++;
        }

        //If theres a overlap or the new Interval appears in the middle
        while(i<n && newInterval[1] >= intervals[i][0]){
            newInterval[0] = Math.min(newInterval[0],intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1],intervals[i][1]);
            i++;
        }
        l.add(newInterval);

        //Remaining Intervals Which comes after the newInterval
        while(i<n){
           l.add(intervals[i]);
           i++; 
        }

        return l.toArray(new int[l.size()][]);
    }
}
