class TopVotedCandidate {
    int [] times;
    int[] leader;
    public TopVotedCandidate(int[] persons, int[] times) {
        this.times=times;
        leader=new int[persons.length];

        int currLeader=-1;
        int maxVotes=0;
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i =0;i<persons.length;i++){
            map.put(persons[i],map.getOrDefault(persons[i],0)+1);
            if(map.get(persons[i])>=maxVotes){
                currLeader=persons[i];
                maxVotes=map.get(persons[i]);
            }
            leader[i]=currLeader;
        }
    }
    
    public int q(int t) {
        return leader[search(t)];
    }

    public int search(int t){
        int start=0;
        int end=times.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(times[mid]<=t){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return end;
    }
}

/**
 * Your TopVotedCandidate object will be instantiated and called as such:
 * TopVotedCandidate obj = new TopVotedCandidate(persons, times);
 * int param_1 = obj.q(t);
 */