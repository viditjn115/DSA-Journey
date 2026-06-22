class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int l=0;
        int h=people.length -1;
        int c_boat=0;
        while(l<=h){
            if(people[l]+people[h]>limit){
                h--;
            }
            else{
                h--;
                l++;
            }
            c_boat++;
        }
        return c_boat ;
    }
}