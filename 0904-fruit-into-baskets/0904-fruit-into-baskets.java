import java.util.*;
class Solution {
    public int totalFruit(int[] fruits) {
        int basket=0;
        int max_basket=0;
        Map<Integer , Integer > map = new HashMap<>();
        int l=fruits.length;
        int start=0;
        for(int i=0;i<l;i++){
            map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
            basket++;
            while(map.size()>2){
                map.put(fruits[start],map.get(fruits[start])-1);
                if(map.get(fruits[start]) == 0){
                    map.remove(fruits[start]);
                }
                basket--;
                start++;
            }
            max_basket=Math.max(max_basket,basket);
        }
        return max_basket;
    }
}