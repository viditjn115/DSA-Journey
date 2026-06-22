import java.util.Arrays;
class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score=0;
        int max_score=0;
            int s=0;
            int e=tokens.length-1;
            while(s<=e){
                if(tokens[s]<=power){
                    power-=tokens[s++];
                    score++;
                    max_score=Math.max(score,max_score);
                }
                else if (score > 0) {
                power += tokens[e--];
                score--;
            } 
            else {
                break;
            }
            }
        return max_score;
    }
}