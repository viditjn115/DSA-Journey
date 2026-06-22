class Solution {
    public int canCompleteCircuit(int [] gas , int [] cost){
        int sum_gas=0;
        int sum_cost=0;
        for(int i=0;i<gas.length;i++){
            sum_gas+=gas[i];
            sum_cost+=cost[i];
        }
        if(sum_gas<sum_cost){
            return -1;
        }
        int start_index=0;
        int tank=0;
        for(int i=0;i<gas.length;i++){
            tank+=gas[i]-cost[i];
            if(tank<0){
                tank=0;
                start_index=i+1;
            }    
        }
    return start_index;
    }
}