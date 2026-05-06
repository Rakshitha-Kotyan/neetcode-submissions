class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tG=0;
        int tC=0;
        int curtank=0;
        int startIndex=0;

        for(int i=0;i<gas.length;i++){
            tG+=gas[i];
            tC+=cost[i];
            curtank+=gas[i]-cost[i];

            if(curtank < 0){
                startIndex=i+1;
                curtank=0;
            }
        }
        if(tG<tC){
            return -1;
        }
        return startIndex;
    }
}
