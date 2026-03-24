class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        long totalcost=0;
        long totalgas=0;
        for(int i=0;i<n;i++){
            totalcost+=cost[i];
            totalgas+=gas[i];
        }
        if(totalgas<totalcost)return-1;

        int index=0;
        int spend=0;
        for(int i=0;i<n;i++){
            spend+=(gas[i]-cost[i]);
            if(spend<0){
                index=i+1;
                spend=0;
            }
        }
        return index;
        
    }
}